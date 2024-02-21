package cz.claimcloud.user.service;

import cz.claimcloud.user.model.api.ProcessMigration;
import org.apache.commons.configuration.ConfigurationException;

import java.io.FileNotFoundException;

public interface CamundaService {

    void startNewShopProcess();

    void migrationAllProcessInstances(ProcessMigration migration);

    void processReferenceCallProcIncident();

    void skipCurrentTask(String instanceId);

    void getErrorHandlingSettings() throws ConfigurationException, org.apache.commons.configuration2.ex.ConfigurationException, FileNotFoundException;
}
