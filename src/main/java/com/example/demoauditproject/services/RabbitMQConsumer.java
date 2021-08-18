package com.example.demoauditproject.services;

import com.example.demoauditproject.entities.Message;
import org.springframework.stereotype.Service;

@Service
public interface RabbitMQConsumer {
    void receivedMessage(Message message);
}
