package cz.claimcloud.user.service.impl;

import cz.claimcloud.user.configuration.ExternalFilesReader;
import cz.claimcloud.user.model.api.ProcessMigration;
import cz.claimcloud.user.service.CamundaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.configuration.ConfigurationException;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.migration.MigrationPlan;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.runtime.ActivityInstance;
import org.camunda.bpm.engine.runtime.Incident;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.camunda.bpm.model.bpmn.instance.SequenceFlow;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

@Service
@Slf4j
@RequiredArgsConstructor
public class CamundaServiceImpl implements CamundaService {

    private final ProcessEngine processEngine;

    private final  RuntimeService runtimeService;

    private final ExternalFilesReader externalFilesReader;

    public void getErrorHandlingSettings() throws ConfigurationException, org.apache.commons.configuration2.ex.ConfigurationException, FileNotFoundException {
        log.info("current errHandlingSettings: {}", externalFilesReader.getStructErrHandlingConfig().toString());
        log.info("current errHandlingSettings: {}", externalFilesReader.getStructErrHandlingConfig().getAutoRetry().get(0));
    }
    public void startNewShopProcess() {
        Map<String, Object> variables=new HashMap<>();
        variables.put("startMsg", "this process was trigger by code");
        ProcessInstanceWithVariables instance = runtimeService.createProcessInstanceByKey("shopProcess").businessKey(UUID.randomUUID().toString())
                .setVariables(variables).executeWithVariablesInReturn();
    }

    public void migrationAllProcessInstances(ProcessMigration processMigration) {
        MigrationPlan migrationPlan = processEngine.getRuntimeService().createMigrationPlan(processMigration.getOldProcDefinitionId(), processMigration.getNewProcDefinitionId()).mapEqualActivities().build();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        List<String> instances = getAllProcessInstances(processMigration.getOldProcDefinitionId());
        if(instances != null || !instances.isEmpty()) {
            runtimeService.newMigration(migrationPlan).processInstanceIds(instances).execute();
        } else {
            log.info("No instances were found");
        }
    }
    private List<String> getAllProcessInstances(String processId) {
        List<String> response;
        // list all running/unsuspended instances of the process
        List<ProcessInstance> processInstances =
                runtimeService.createProcessInstanceQuery()
                        .processDefinitionId(processId) //myProcessDefinition.getId())
                        .active() // we only want the unsuspended process instances
                        .list();
        log.info("processInstances: {}", processInstances);
        response = processInstances.stream().map(ProcessInstance::getRootProcessInstanceId).toList();
        return response;
    }

    public void processReferenceCallProcIncident() {
        log.info("Start processing of incidents triggered in reference call flows info");
        log.debug("Start processing of incidents triggered in reference call flows debug");
        log.error("Start processing of incidents triggered in reference call flows err");
        log.trace("Start processing of incidents triggered in reference call flows trace");
        log.warn("Start processing of incidents triggered in reference call flows warn");
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        Date timestampBefore = new Date(System.currentTimeMillis() - 60 * 1000);
        List<String> autoRetryJobsId = new ArrayList<>();
        try (
                Stream<Incident> incidentStream = runtimeService.createIncidentQuery()
                        //.processDefinitionId("shopProcess:8:1d64783e-8887-11ee-b26f-a0a4c5324a98")
                        //.processDefinitionKeyIn("shopProcess")//, "ReferenceCallAsync", "ReferenceCallSync")
                        //.incidentTimestampBefore(timestampBefore)
                        .list()
                        .stream()
        ) {

            incidentStream.forEach(

                    incidentRecord -> {
                        log.info("Retry of process instance {} task {}",
                                incidentRecord.getProcessInstanceId(), incidentRecord.getFailedActivityId());
                        String activityId = incidentRecord.getFailedActivityId();
                       // skipTask(incidentRecord.getProcessInstanceId(), incidentRecord.getFailedActivityId(), incidentRecord.getProcessDefinitionId());
                       // killProcess(incidentRecord.getProcessInstanceId());
                        if (!activityId.isEmpty())
                            autoRetryJobsId.add(incidentRecord.getConfiguration());
                    }
            );


            if (!autoRetryJobsId.isEmpty())
                log.info(autoRetryJobsId.toString());
            //------------------------- Auto retry --------------------------------------
            autoRetry(autoRetryJobsId);
        }
        log.info("Finish processing of incidents triggered in reference call flows");
    }
    private void killProcess(String instanceId) {
       ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
       processEngine.getRuntimeService().deleteProcessInstance(instanceId, "Fatal error");
    }

    private void autoRetry(List<String> ids) {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        processEngine.getManagementService().setJobRetries(ids, 1);
    }

    public void skipCurrentTask(String instanceId) {
        List<String> activityIds = processEngine.getRuntimeService().getActiveActivityIds(instanceId);
        log.info("currentActivityids: {}", activityIds);
        ActivityInstance activityInstance = processEngine.getRuntimeService().getActivityInstance(instanceId);
        log.info("activityInstance: {}", activityInstance.toString());
        log.info("activityInstance getProcessDefinitionId: {}", activityInstance.getProcessDefinitionId());
        activityIds.forEach(activityId -> skipTask(instanceId,activityId, activityInstance.getProcessDefinitionId()));

    }

    private void updateInstanceVariable(String instanceId, String variableName, Object variableValue) {
        processEngine.getRuntimeService().setVariable(instanceId, variableName, variableValue);
    }
    private void skipTask(String instanceId, String skipActivityId, String processDefinitionId) {
        String nextActivityId = getNextActivity(skipActivityId, processDefinitionId);
        if(nextActivityId != null) {
            //just example how to create new / update variable in process by instance id
            updateInstanceVariable(instanceId, "getLoan", false);
            processEngine.getRuntimeService()
                    .createProcessInstanceModification(instanceId).cancelAllForActivity(skipActivityId)
                    .startBeforeActivity(nextActivityId).execute();
        }
    }
    private String getNextActivity(String curActivityId, String processDefinitionId) {
        log.info("start getNextActivity");
        RepositoryService repositoryService = processEngine.getRepositoryService();

        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
                .processDefinitionId(processDefinitionId).singleResult();
        BpmnModelInstance modelInstance = repositoryService.getBpmnModelInstance(processDefinition.getId());
        Collection<SequenceFlow> sequenceFlows = modelInstance.getModelElementsByType(SequenceFlow.class);
        for (SequenceFlow flow : sequenceFlows) {
            if (flow.getSource().getId().equals(curActivityId)) {
                if(flow.getTarget() != null) {
                    log.info("next activity id: {} name: {}", flow.getTarget().getId(), flow.getTarget().getName());
                    return flow.getTarget().getId();
                }
            }
        }
        log.info("Any next activity does not exist");
        return null;
    }
}
