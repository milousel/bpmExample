package cz.claimcloud.user.controller;

import cz.claimcloud.user.constant.QRCodeContant;
import cz.claimcloud.user.model.api.DigestReq;
import cz.claimcloud.user.model.api.GenerateQRCodeReq;
import cz.claimcloud.user.model.api.PayReq;
import cz.claimcloud.user.service.PaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.KeyException;
import java.security.KeyStoreException;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/payment")
public class PaymentController {

    private final PaymentService service;

    @PostMapping(path = "/createDigest")
    public ResponseEntity<String> createDigest(@Valid @RequestBody DigestReq digestReq) throws KeyStoreException, KeyException {
        String sign = service.createDigest(digestReq.getMessage(), true);
        return ResponseEntity.ok(sign);
    }

    @PostMapping(path = "/createPaymentLink")
    public ResponseEntity<String> newPayment(@Valid @RequestBody PayReq payReq) throws KeyStoreException, KeyException {
        /*
        TODO: Dovyjasnit si interface + odkud se bude např. získávat následující čísla objednávek (GP webpay / naše DB)
         */
        if (payReq.getAmount() <= 0) {
            return new ResponseEntity<>("Amount must be bigger then 0.", HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(service.createPaymentLink(payReq));
    }

    @PostMapping(path = "/qrCode")
    public ResponseEntity<?> generateQRCodeImg(@Valid @RequestBody GenerateQRCodeReq generateQRCodeReq) throws Exception {
        if (!QRCodeContant.allowQRFormat().contains(generateQRCodeReq.getQrFormat())) {
            return new ResponseEntity<>("QR format value must have value in:".concat(QRCodeContant.allowQRFormat().toString()), HttpStatus.BAD_REQUEST);
        }
        Object resp = service.generateQRCode(generateQRCodeReq);
        if (Objects.equals(generateQRCodeReq.getQrFormat(), QRCodeContant.imageFormat)) {
            final HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_PNG);
            return new ResponseEntity<>(resp, headers, HttpStatus.CREATED);
        } else {
            return ResponseEntity.ok("filename is: " + service.generateQRCode(generateQRCodeReq));
        }
    }

    @GetMapping(path = "/soapCall")
    public ResponseEntity<String> soapCall() {
        service.callSoap();
        return ResponseEntity.ok("je to ok");
    }

    @GetMapping(path = "/invoice")
    public ResponseEntity<String> generateInvoice() throws IOException {
        service.generateInvoice();
        return ResponseEntity.ok("je to ok");
    }
}
