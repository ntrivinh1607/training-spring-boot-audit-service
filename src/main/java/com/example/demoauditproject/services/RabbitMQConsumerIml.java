package com.example.demoauditproject.services;

import com.example.demoauditproject.entities.Message;
import com.example.demoauditproject.repositories.MessageRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumerIml implements RabbitMQConsumer{
    @Autowired
    MessageRepository messageRepository;

    @Override
    @RabbitListener(queues = "${rabbitmq.queue}")
    public void receivedMessage(Message message) {
        System.out.println("Receive Message From RabbitMQ: " + message.getContent());
        messageRepository.save(message);
    }
}
