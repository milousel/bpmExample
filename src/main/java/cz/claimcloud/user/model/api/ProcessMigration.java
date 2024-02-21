package cz.claimcloud.user.model.api;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProcessMigration {

    @NotNull
    private String oldProcDefinitionId;
    @NotNull
    private String newProcDefinitionId;

}
