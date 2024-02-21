package cz.claimcloud.user.controller;

import cz.claimcloud.user.model.entity.Employee;
import cz.claimcloud.user.service.RabbitMQService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/v1/rabbit")
@RequiredArgsConstructor
public class RabbitMQController {

    private final RabbitMQService service;

    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        service.sendMessage(message);
        return ResponseEntity.ok("Message sent to RabbitMQ ...");
    }

    @PostMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestBody Employee employee) {
        service.sendJsonMessage(employee);
        return ResponseEntity.ok("Json message sent to RabbitMQ ...");
    }

}
