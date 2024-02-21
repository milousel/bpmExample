package cz.claimcloud.user.component;

import cz.claimcloud.user.service.CamundaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Scheduler {

    private final CamundaService service;

    @Scheduled(cron = "${scheduler.processReferenceCallProcIncident-timer}")
    public void processReferenceCallProcIncident() {
        log.info("scheduler start operation processReferenceCallProcIncident");
        service.processReferenceCallProcIncident();
    }
}
