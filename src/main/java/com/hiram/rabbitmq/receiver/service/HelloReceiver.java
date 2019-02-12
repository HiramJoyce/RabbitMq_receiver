package com.hiram.rabbitmq.receiver.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceiver {

    /**
     * Direct模式
     */
//    @RabbitListener(queues = "queue")
//    public void process(String message) {
//        System.out.println("Receive : " + message);
//    }

    /**
     * Topic模式
     */
//    @RabbitListener(queues = "topic.message")
//    public void process1(String message) {
//        System.out.println("message : " + message);
//    }
//
//    @RabbitListener(queues = "topic.messages")
//    public void process2(String message) {
//        System.out.println("messages : " + message);
//    }

    /**
     * Fanout模式
     */
    @RabbitListener(queues = "fanout.A")
    public void process1(String message) {
        System.out.println("ReceiveA : " + message);
    }

    @RabbitListener(queues = "fanout.B")
    public void process2(String message) {
        System.out.println("ReceiveB : " + message);
    }

    @RabbitListener(queues = "fanout.C")
    public void process3(String message) {
        System.out.println("ReceiveC : " + message);
    }
}
