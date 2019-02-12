package com.hiram.rabbitmq.receiver.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 一点经验：
 *  在receiver中配置bean的作用：
 *      如果没有在配置文件中配置bean，启动springboot时:
 *          mq中存在对应的队列 -> 正常启动
 *          mq中不存在对应的队列 -> 启动失败
 *      如果在配置文件中配置了bean，启动springboot时:
 *          mq中不存在对应的队列 -> 创建相应的队列 -> 正常启动
 */
@Configuration
public class ReceiverConf {

    /**
     * Direct模式
     */
//    @Bean
//    public Queue queue() {
//        return new Queue("queue");
//    }

    /**
     * Topic模式
     */
//    @Bean
//    public Queue queueMessage() {
//        return new Queue("topic.message");
//    }
//
//    @Bean
//    public Queue queueMessages() {
//        return new Queue("topic.messages");
//    }

    /**
     * Fanout模式（广播）
     */
    @Bean
    public Queue AMessage() {
        return new Queue("fanout.A");
    }

    @Bean
    public Queue BMessage() {
        return new Queue("fanout.B");
    }

    @Bean
    public Queue CMessage() {
        return new Queue("fanout.C");
    }
}
