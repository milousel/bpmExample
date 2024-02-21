package cz.claimcloud.user.model.api.GPWebpay.PaymentLink;

import lombok.Data;

@Data
public class CardHolderData {

    private CardHolderDetails cardHolderDetails;
    private BillingDetails billingDetails;
    private ShippingDetails shippingDetails;
}
