package cz.claimcloud.user.model.api;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class GenerateQRCodeReq {

    @NotNull
    String accountNum;

    @NotNull
    String qrFormat; // save as file or return as image

    @NotNull
    String bankCode;

    @NotNull
    String countryCode;

    @NotNull
    Integer amount;

    String currency;

    String dueDate; // format YYYYMMDD (example 20121231)

    String message;

    String variableSymbol;

    String specificSymbol;

    String constantSymbol;


}
