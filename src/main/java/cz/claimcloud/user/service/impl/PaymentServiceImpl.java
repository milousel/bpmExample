package cz.claimcloud.user.service.impl;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import cz.claimcloud.user.configuration.ExternalFilesReader;
import cz.claimcloud.user.constant.GPWebpayContant;
import cz.claimcloud.user.constant.GPWebpayOperationsContant;
import cz.claimcloud.user.constant.QRCodeContant;
import cz.claimcloud.user.model.api.GenerateQRCodeReq;
import cz.claimcloud.user.model.api.PayReq;
import cz.claimcloud.user.service.PaymentService;
import cz.gpe.pay.pay_ws.proc.v1.PaymentPort;
import cz.gpe.pay.pay_ws.proc.v1.ServiceException;
import cz.gpe.pay.pay_ws.proc.v1.type.PaymentStatusRequest;
import cz.gpe.pay.pay_ws.proc.v1.type.PaymentStatusResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.FileSystems;
import java.security.*;
import java.util.Base64;
import java.util.Calendar;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    @Value("${gpwebpay.sign.method}")
    private String method;

    @Value("${gpwebpay.sign.encoding}")
    private String encoding;

    @Value("${gpwebpay.merchantNumber}")
    private String merchantNumber;

    @Value("${gpwebpay.respUrl}")
    private String respUrl;

    @Value("${gpwebpay.url}")
    private String gpWebpayUrl;

    @Value("${qrCode.width}")
    private String qrCodeWidth;

    @Value("${qrCode.height}")
    private String qrCodeHeight;

    @Value("${qrCode.path}")
    private String qrCodePath;


    private final ExternalFilesReader externalFilesReader;

    public String createPaymentLink(PayReq payReq) throws KeyStoreException, KeyException {
        String message = createPaymentDigestMsg(payReq);
        String digest = createDigest(message, true);
        String link = gpWebpayUrl.concat("?");
        link = addParamIntoLink(link, GPWebpayContant.merchantNumber, merchantNumber);
        link = addParamIntoLink(link, GPWebpayContant.operation, GPWebpayOperationsContant.create_order);
        link = addParamIntoLink(link, GPWebpayContant.ordernumber, payReq.getOrderNumber());
        link = addParamIntoLink(link, GPWebpayContant.amount, payReq.getAmount());
        if (payReq.getCurrency() != null) {
            link = addParamIntoLink(link, GPWebpayContant.currency, payReq.getCurrency());
        }
        link = addParamIntoLink(link, GPWebpayContant.depositflag, payReq.getDepositFlag());
        link = addParamIntoLink(link, GPWebpayContant.url, respUrl);
        if (payReq.getDesc() != null) {
            link = addParamIntoLink(link, GPWebpayContant.description, payReq.getDesc());
        }
        if (payReq.getPayMethod() != null) {
            link = addParamIntoLink(link, GPWebpayContant.paymethod, payReq.getPayMethod());
        }
        if (payReq.getCustomerEmail() != null) {
            link = addParamIntoLink(link, GPWebpayContant.email, payReq.getCustomerEmail());
        }
        if (payReq.getReferenceNumber() != null) {
            link = addParamIntoLink(link, GPWebpayContant.referencenumber, payReq.getReferenceNumber());
        }
        link = addParamIntoLink(link, GPWebpayContant.digest, digest);

        log.info("createPaymentLink resp: {}", link);
        return link;
    }

    public String createDigest(String message, Boolean isRest) throws KeyException, KeyStoreException {
        log.info("createDigest input: {}", message);
        PrivateKey privateKey = externalFilesReader.getGPWebpayPrivateKey();
        try {
            Signature sig = Signature.getInstance(method);
            sig.initSign(privateKey);
            sig.update(message.getBytes(encoding));
            byte[] signature = sig.sign();
            String signEnc = Base64.getEncoder().encodeToString(signature);
            signEnc = signEnc.replaceAll("\r", "").replaceAll("\n", "");
            if (isRest) {
                signEnc = signEnc.replaceAll("\\+", "%2B");
            }
            log.info("sign resp: {}", signEnc);
            return signEnc;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException | InvalidKeyException | SignatureException e) {
            e.printStackTrace();
            throw new KeyException(e);
        }
    }

    public Object generateQRCode(GenerateQRCodeReq generateQRCodeReq) throws Exception {
        if (!QRCodeContant.allowQRFormat().contains(generateQRCodeReq.getQrFormat())) {
            throw new RuntimeException("Invalid QR format value");
        }
        String text = createQRCodeText(generateQRCodeReq);
        switch (generateQRCodeReq.getQrFormat()) {
            case (QRCodeContant.imageFormat) -> {
                return generateImageQRCode(text);
            }
            case (QRCodeContant.fileFormat) -> {
                return generateFileQRCode(text);
            }
            default -> throw new RuntimeException("Invalid QR format value");
        }
    }

    //first try of generating .pdf file
    public void generateInvoice() throws IOException {
        PDDocument document = new PDDocument();
        PDPage firstPage = new PDPage();
        document.addPage(firstPage);

        // document information
        PDDocumentInformation documentInformation = document.getDocumentInformation();
        documentInformation.setAuthor("dCOS s.r.o.");
        documentInformation.setTitle("Invoice");
        documentInformation.setCreator("Auto generated file");
        documentInformation.setCreationDate(Calendar.getInstance());
        documentInformation.setSubject("Invoice");

        // permision
        AccessPermission accessPermission = new AccessPermission();
        StandardProtectionPolicy policy = new StandardProtectionPolicy("123", "user", accessPermission);
        policy.setEncryptionKeyLength(128);
        policy.setPermissions(accessPermission);
        accessPermission.setCanModify(false);
        accessPermission.setCanPrint(false);
        document.protect(policy);

        document.save("/Users/lejce/Desktop/Development/invoice_" + UUID.randomUUID() + ".pdf");
        document.close();
    }

    //it is only example method of how to create SOAP call by gpwebpay wsdl.
    // Before use, you must run "mvn clean install" command
    public void callSoap() {
        cz.gpe.pay.pay_ws.proc.v1.PaymentService paymentService = new cz.gpe.pay.pay_ws.proc.v1.PaymentService();
        PaymentPort paymentPort = paymentService.getPaymentPortV1();
        try {
            PaymentStatusRequest request = new PaymentStatusRequest();
            String messageId = "7925695382263005";
            request.setMessageId(messageId);
            request.setMerchantNumber(merchantNumber);
            request.setProvider("0880");
            request.setPaymentNumber("74696099");
            String msg = messageId;
            msg = addParamIntoDigestMsg(msg, "0880");
            msg = addParamIntoDigestMsg(msg, merchantNumber);
            msg = addParamIntoDigestMsg(msg, "74696099");
            String signature = createDigest(msg, false);
            request.setSignature(Base64.getDecoder().decode(signature.getBytes()));
            PaymentStatusResponse response = paymentPort.getPaymentStatus(request);
            log.info("response {}", response.getStatus());
        } catch (ServiceException | KeyStoreException | KeyException e) {
            throw new RuntimeException(e);
        }
    }

    private byte[] generateImageQRCode(String text) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        try {
            BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, Integer.parseInt(qrCodeWidth), Integer.parseInt(qrCodeHeight));
            MatrixToImageConfig config = new MatrixToImageConfig(0xFF000000, 0xFFFFFFFF);
            MatrixToImageWriter.writeToStream(bitMatrix, "PNG", outputStream, config);

        } catch (WriterException | IOException e) {
            throw new RuntimeException(e);
        }
        return outputStream.toByteArray();
    }

    private String generateFileQRCode(String text) {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        String filename = UUID.randomUUID() + ".png";
        try {
            BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, Integer.parseInt(qrCodeWidth), Integer.parseInt(qrCodeHeight));
            MatrixToImageWriter.writeToPath(bitMatrix, "PNG", FileSystems.getDefault().getPath(qrCodePath.concat(filename)));
        } catch (WriterException | IOException e) {
            throw new RuntimeException(e);
        }
        return filename;
    }

    private String createQRCodeText(GenerateQRCodeReq generateQRCodeReq) throws Exception {
        String resp = QRCodeContant.header.concat("*" + QRCodeContant.version);
        Iban iban = convertAccountNumToIban(generateQRCodeReq.getAccountNum(), generateQRCodeReq.getBankCode(), generateQRCodeReq.getCountryCode());
        resp = addParamToQRCodeText(resp, QRCodeContant.iban, iban.toString());
        resp = addParamToQRCodeText(resp, QRCodeContant.amount, generateQRCodeReq.getAmount());
        if (generateQRCodeReq.getCurrency() != null) {
            resp = addParamToQRCodeText(resp, QRCodeContant.currency, generateQRCodeReq.getCurrency());
        }
        if (generateQRCodeReq.getDueDate() != null) {
            resp = addParamToQRCodeText(resp, QRCodeContant.dueDate, generateQRCodeReq.getDueDate());
        }
        if (generateQRCodeReq.getMessage() != null) {
            resp = addParamToQRCodeText(resp, QRCodeContant.message, generateQRCodeReq.getMessage());
        }
        if (generateQRCodeReq.getVariableSymbol() != null) {
            resp = addParamToQRCodeText(resp, QRCodeContant.variableSymbol, generateQRCodeReq.getVariableSymbol());
        }
        if (generateQRCodeReq.getSpecificSymbol() != null) {
            resp = addParamToQRCodeText(resp, QRCodeContant.specificSymbol, generateQRCodeReq.getSpecificSymbol());
        }
        if (generateQRCodeReq.getConstantSymbol() != null) {
            resp = addParamToQRCodeText(resp, QRCodeContant.constantSymbol, generateQRCodeReq.getConstantSymbol());
        }
        log.info("createQRCodeText resp: {}", resp);
        return resp;
    }

    private String addParamToQRCodeText(String text, String paramName, Object paramValue) {
        return text.concat("*" + paramName + ":" + paramValue);
    }

    private Iban convertAccountNumToIban(String accountNum, String bankCode, String countryCode) throws Exception {
        if (accountNum.length() < QRCodeContant.accountLength) {
            accountNum = addZerosToAccountNum(accountNum);
        } else if (accountNum.length() > QRCodeContant.accountLength) {
            throw new Exception("account number is longer then" + QRCodeContant.accountLength);
        }
        CountryCode countCode = CountryCode.getByCode(countryCode);
        if (countCode == null) {
            throw new Exception("country code was not found");
        }
        return new Iban.Builder()
                .countryCode(countCode)
                .bankCode(bankCode)
                .accountNumber(accountNum)
                .build();
    }

    private String addZerosToAccountNum(String accountNum) {
        int diff = QRCodeContant.accountLength - accountNum.length();
        StringBuilder accountNumBuilder = new StringBuilder(accountNum);
        for (int i = 0; i < diff; i++) {
            accountNumBuilder.insert(0, "0");
        }
        // accountNum = accountNumBuilder.toString();
        log.info("accountNum: {}", accountNumBuilder);
        return accountNumBuilder.toString();
    }

    private String addParamIntoLink(String curLink, String varName, Object varValue) {
        return curLink.concat("&" + varName + "=" + varValue);
    }

    private String createPaymentDigestMsg(PayReq payReq) {
        String digestMsg = merchantNumber;
        digestMsg = addParamIntoDigestMsg(digestMsg, GPWebpayOperationsContant.create_order);
        digestMsg = addParamIntoDigestMsg(digestMsg, payReq.getOrderNumber());
        digestMsg = addParamIntoDigestMsg(digestMsg, payReq.getAmount());
        if (payReq.getCurrency() != null) {
            digestMsg = addParamIntoDigestMsg(digestMsg, payReq.getCurrency());
        }
        digestMsg = addParamIntoDigestMsg(digestMsg, payReq.getDepositFlag());
        digestMsg = addParamIntoDigestMsg(digestMsg, respUrl);
        if (payReq.getDesc() != null) {
            digestMsg = addParamIntoDigestMsg(digestMsg, payReq.getDesc());
        }
        if (payReq.getPayMethod() != null) {
            digestMsg = addParamIntoDigestMsg(digestMsg, payReq.getPayMethod());
        }
        if (payReq.getCustomerEmail() != null) {
            digestMsg = addParamIntoDigestMsg(digestMsg, payReq.getCustomerEmail());
        }
        if (payReq.getReferenceNumber() != null) {
            digestMsg = addParamIntoDigestMsg(digestMsg, payReq.getReferenceNumber());
        }
        log.info("digestMsg: {}", digestMsg);
        return digestMsg;
    }

    private String addParamIntoDigestMsg(String msg, Object param) {
        return msg.concat("|" + param);
    }
}
