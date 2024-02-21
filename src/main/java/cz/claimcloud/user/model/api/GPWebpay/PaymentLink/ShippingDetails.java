package cz.claimcloud.user.model.api.GPWebpay.PaymentLink;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Base64;

@Data
public class ShippingDetails {

    @NotNull
    @Size(max = 255,message = "maximum shippingDetails name length is 255")
    private String name;

    @NotNull
    @Size(max = 50,message = "maximum shippingDetails address1 length is 50")
    private String address1;

    private String address2;
    private String address3;

    @NotNull
    @Size(max = 50,message = "maximum shippingDetails city length is 50")
    private String city;

    @NotNull
    @Size(max = 16,message = "maximum shippingDetails postalCode length is 16")
    private String postalCode;

    @NotNull
    @Size(max = 3,message = "maximum shippingDetails country length is 3")
    private String country;

    private String countrySubdivision;
    private String phone;
    private String email;
    private String method;

    @NotNull
    @Size(max = 3,message = "maximum shippingDetails country length is 3")
    private Base64 signature;
}
