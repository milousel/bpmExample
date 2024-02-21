package cz.claimcloud.user.service;

import cz.claimcloud.user.model.api.GenerateQRCodeReq;
import cz.claimcloud.user.model.api.PayReq;

import java.io.IOException;
import java.security.KeyException;
import java.security.KeyStoreException;

public interface PaymentService {

    String createDigest(String message, Boolean isRest) throws KeyException, KeyStoreException;

    String createPaymentLink(PayReq payReq) throws KeyStoreException, KeyException;

    Object generateQRCode(GenerateQRCodeReq generateQRCodeReq) throws Exception;

    void callSoap();

    void generateInvoice() throws IOException;

}
