package cz.claimcloud.user.model.api.GPWebpay.PaymentLink;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CardHolderDetails {

    @NotNull
    @Size(min = 2, max = 45,message = "cardHolder name length must be between 2-45")
    private String name;

    private String loginId;
    private Integer loginType;
    private Integer loginTime;
    private String userAccountId;
    private Integer userAccountCreatedDate;
    private Integer userAccountAge;
    private Integer userAccountLastChangeDate;
    private Integer userAccountLastChangeAge;
    private Integer userAccountPasswordChangeDate;
    private Integer userAccountPasswordChangeAge;

    private String socialNetworkId;

    @NotNull
    @Size(max = 255,message = "maximum cardHolder email length is 255")
    private String email;

    private String phoneCountry;
    private String phone;
    private String mobilePhoneCountry;
    private String mobilePhone;
    private String workPhoneCountry;
    private String workPhone;
    private String clientIpAddress;
    private String addressMatch;

}
