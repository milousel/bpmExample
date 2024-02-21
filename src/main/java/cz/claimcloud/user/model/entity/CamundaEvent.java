package cz.claimcloud.user.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "camunda_event")
public class CamundaEvent {

    @Id
    private String id;
    private String name;
    private String eventType;
    private String activityInstanceId;
    private String processInstanceId;
    private List<String> variablesList;
}
