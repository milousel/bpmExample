package cz.claimcloud.user.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrHandlingDto {

    private List<String> autoRetry;
    private List<String> terminate;
    private List<String> skip;

}
