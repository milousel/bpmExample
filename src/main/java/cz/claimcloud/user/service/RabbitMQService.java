package cz.claimcloud.user.service;

import cz.claimcloud.user.model.entity.Employee;

public interface RabbitMQService {
    void sendMessage(String message);

    void sendJsonMessage(Employee employee);
}
