package cz.claimcloud.user.model.api.GPWebpay.PaymentLink;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class PaymentLinkReq {

    @NotNull
    @Size(min = 16, max = 256, message = "messageId length must be between 16-256")
    private String messageId;

    @NotNull
    @Size(max = 4, message = "maximum provider length is 4")
    private String provider;

    @NotNull
    @Size(max = 10, message = "maximum merchantNumber length is 10")
    private String merchantNumber;

    @NotNull
    @Size(max = 15, message = "maximum paymentNumber length is 15")
    private Integer paymentNumber;

    @NotNull
    @Size(max = 15, message = "maximum amount length is 15")
    private Integer amount;

    @NotNull
    @Size(max = 3, message = "maximum currencyCode length is 3")
    private Integer currencyCode;

    @NotNull
    @Size(max = 1, message = "captureFlag allowed values are 0 and 1")
    private Integer captureFlag;

    private Integer orderNumber;
    private String referenceNumber;
    private String url;
    private String description;
    private String merchantData;
    private Integer fastPayId;
    private String defaultPayMethod;
    private String disabledPayMethods;

    @NotNull
    @Size(min = 6, max = 255,message = "email length must be between 6-255")
    private String email;

    private String merchantEmail;

    @NotNull
    private Date paymentExpiry; //možná se bude muset předělat na String, který budu konvertovat, třeba vyzkoušet

    private String language;
    private Boolean registerRecurring;
    private Boolean registerToken;
    private CardHolderData cardHolderData;


}
