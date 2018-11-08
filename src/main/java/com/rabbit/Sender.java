package com.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 生产者
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello生产者1: message" + new Date();
        System.out.println("Sender1:" + context);
        this.amqpTemplate.convertAndSend("exchange","topic.message",context);
        System.out.println("第一个消息发送完成");
    }

    public void send2(){
        String str = "hello生产者2：messages" + new Date();
        System.out.println("Sender2: " + str);
        this.amqpTemplate.convertAndSend("exchange","topic.messages",str);
        System.out.println("第二个消息发送完成");
    }


}
