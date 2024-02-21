package cz.claimcloud.user.model.api;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DigestReq {

    @NotNull
    String message;
}
