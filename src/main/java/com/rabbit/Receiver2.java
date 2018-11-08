package com.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class Receiver2 {
    @RabbitHandler
    public void process1(String hello){
        System.out.println("Receiver2: " + hello);
    }
}
