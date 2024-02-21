package cz.claimcloud.user.controller;

import cz.claimcloud.user.model.api.ProcessMigration;
import cz.claimcloud.user.service.CamundaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.commons.configuration.ConfigurationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/camunda")
public class CamundaController {

    private final CamundaService service;

    @GetMapping(path = "/startNewShopProcess")
    public ResponseEntity<?> startNewShopProcess() {
        service.startNewShopProcess();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(path = "/migrationAllProcessInstances")
    public ResponseEntity<?> migrationAllLoanProcesses(@Valid @RequestBody ProcessMigration processMigration) {service.migrationAllProcessInstances(processMigration);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(path = "/solveIncident")
    public ResponseEntity<?> processReferenceCallProcIncident(){
        service.processReferenceCallProcIncident();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(path = "/skipTask/{instanceId}")
    public ResponseEntity<?> skipCurrentTask(@PathVariable String instanceId){
        service.skipCurrentTask(instanceId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(path = "/loadConfig")
    public ResponseEntity<?> loadConfig() throws ConfigurationException, org.apache.commons.configuration2.ex.ConfigurationException, FileNotFoundException {
        service.getErrorHandlingSettings();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
