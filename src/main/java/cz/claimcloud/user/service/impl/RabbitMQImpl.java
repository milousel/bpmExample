package cz.claimcloud.user.service.impl;

import cz.claimcloud.user.model.entity.Employee;
import cz.claimcloud.user.service.EmployeeService;
import cz.claimcloud.user.service.RabbitMQService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class RabbitMQImpl implements RabbitMQService {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    @Value("${rabbitmq.routing.json.key}")
    private String routingJsonKey;

    private final RabbitTemplate rabbitTemplate;

    private final EmployeeService employeeService;

    public void sendMessage(String message) {
        log.info("Message sent: {}", message);
        rabbitTemplate.convertAndSend(exchange, routingKey.concat("test"), message);
    }

    public void sendJsonMessage(Employee employee) {
        log.info("Json message sent: {}", employee);
        rabbitTemplate.convertAndSend(exchange, routingJsonKey.concat("jsonTest"), employee);
    }

    //@RabbitListener(queues = {"${rabbitmq.queue.name}"})
    private void consume(String message) {
        log.info("Receive message from RabbitMQ : {}", message);
    }

    //@RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    private void consumeJson(Employee employee) {
        log.info("Receive message from RabbitMQ : {}", employee);
        employeeService.saveEmployee(employee);

    }

}
