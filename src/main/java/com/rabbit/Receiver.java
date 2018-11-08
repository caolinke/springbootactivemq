package com.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 */
@Component
@RabbitListener(queues = "topic.message")
public class Receiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver1: " + hello);
    }

}
