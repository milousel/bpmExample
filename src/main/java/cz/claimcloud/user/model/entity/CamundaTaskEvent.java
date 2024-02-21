package cz.claimcloud.user.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "camunda_task_event")
public class CamundaTaskEvent {

    @Id
    private String id;
    private String name;
    private String eventType;
    private String activityInstanceId;
    private String processInstanceId;
    private String assignee;
    private String owner;
    private Date dueDate;
    private Date createdDate;
    private int priority;
    private List<String> variablesList;
}
