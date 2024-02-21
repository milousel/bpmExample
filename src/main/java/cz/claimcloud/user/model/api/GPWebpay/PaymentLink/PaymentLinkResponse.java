package cz.claimcloud.user.model.api.GPWebpay.PaymentLink;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Base64;

@Data
public class PaymentLinkResponse {

    @NotNull
    @Size(min = 16, max = 256, message = "messageId length must be between 16-256")
    private String messageId;

    @NotNull
    @Size(max = 15, message = "maximum paymentNumber length is 15")
    private String paymentNumber;

    @NotNull
    private String paymentLink;

    @NotNull
    @Size(max = 1024, message = "maximum signature length is 1024")
    private Base64 signature;
}
