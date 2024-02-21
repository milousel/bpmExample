package cz.claimcloud.user.bpm.listener;

import cz.claimcloud.user.constant.CamundaConstant;
import cz.claimcloud.user.model.entity.CamundaEvent;
import cz.claimcloud.user.model.entity.CamundaTaskEvent;
import cz.claimcloud.user.repository.CamundaTaskEventElasticRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Component
@Slf4j
@RequiredArgsConstructor
public class CamundaEventListeners {

    /***
     *
     * Rodíl mezi TaskEvent a DelegateTask (stejně jako mezi DelegateExecution a executionEvent) je v tom, že
     * executionEvent a TaskEvent jsou neměnné struktury, kdežto DelegateTask a DelegateExecution jsou měnné tj.
     * za běhu mohou měnit svou hodnotu, což se může projevit hlavně u async volání
     *
     * HistoryEvent - speciální eventListener určený pro dotažení si historie procesu, mělo by to být schopné dotáhnout
     * z DB informaci o předchozím průběhu dat. toku procesem
     */

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.json.key}")
    private String routingJsonKey;

    private final RabbitTemplate rabbitTemplate;

    private final CamundaTaskEventElasticRepository taskEventRepository;

    @EventListener() //condition = "#delegateTask != null && #delegateTask.eventName !='update'")
    public void onTaskEvent(DelegateTask delegateTask) {
        if (delegateTask != null && !Objects.equals(delegateTask.getEventName(), "update")) {
            Map<String, Object> variables = delegateTask.getVariables();
            List<String> variablesList = new ArrayList<>();
            variables.forEach((s, o) -> {
                if (o != null)
                    variablesList.add(s + ": " + o.toString());
            });
            CamundaTaskEvent event = new CamundaTaskEvent();
            event.setName(delegateTask.getName());
            event.setEventType(delegateTask.getEventName());
            event.setActivityInstanceId(delegateTask.getCaseInstanceId());
            event.setProcessInstanceId(delegateTask.getProcessInstanceId());
            event.setAssignee(delegateTask.getAssignee());
            event.setOwner(delegateTask.getOwner());
            event.setPriority(delegateTask.getPriority());
            event.setDueDate(delegateTask.getDueDate());
            event.setCreatedDate(delegateTask.getCreateTime());
            event.setVariablesList(variablesList);
            log.info("TASK EVENT Receive notify: {}", event);

            taskEventRepository.save(event);
            rabbitTemplate.convertAndSend(exchange, routingJsonKey.concat("taskEvent"), event);
        }
    }

    @EventListener()
    public void onExecutionEvent(DelegateExecution execution) {
        if (execution != null && !Objects.equals(execution.getEventName(), "take") &&
                !Objects.equals(execution.getBpmnModelElementInstance().getElementType().getTypeName(), "userTask")
                && StringUtils.startsWithAny(execution.getActivityInstanceId(), CamundaConstant.allowAcitivityTypes())) {
            Map<String, Object> variables = execution.getVariables();
            List<String> variablesList = new ArrayList<>();
            variables.forEach((s, o) -> {
                if (o != null)
                    variablesList.add(s + ": " + o.toString());
            });
            CamundaEvent event = new CamundaEvent();
            event.setName(execution.getCurrentActivityName());
            event.setEventType(execution.getEventName());
            event.setActivityInstanceId(execution.getActivityInstanceId());
            event.setProcessInstanceId(execution.getProcessInstanceId());
            event.setVariablesList(variablesList);
            log.info("Receive notify: {}", event);


            rabbitTemplate.convertAndSend(exchange, routingJsonKey.concat("executionEvent"), event);
        }
    }
/*

    @EventListener
    public void onTaskEvent(TaskEvent taskEvent) {
        log.info("TaskEvent Handling immutable:" + taskEvent.getTaskDefinitionKey());
    }

    @EventListener
    public void onExecutionEvent(ExecutionEvent executionEvent) {
        log.info("ExecutionEvent Handling immutable: "+ executionEvent.getProcessDefinitionId());
    }

    @EventListener
    public void onHistoryEvent(HistoryEvent historyEvent) {
        log.info("HistoryEvent Handling mutable: "+ historyEvent.getEventType());
    }
    */
}
