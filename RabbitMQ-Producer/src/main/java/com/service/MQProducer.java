package com.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.connection.CorrelationData;

/**
 * @ProjectName: SpringBoot-Mqtt
 * @Package: com.service
 * @ClassName: MQProducer
 * @Author: LXC
 * @Description: 消息队列生产者
 * @Date: 2021/4/22 11:44 am
 */
public interface MQProducer {
    /**
     * Convert a Java object to an Amqp Message and send it to a default exchange with a default routing key.
     * 由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。
     *
     * @param message
     */
    void sendDataToRabbitMQ(java.lang.Object message);

    /**
     * Convert a Java object to an Amqp Message and send it to a default exchange with a default routing key.
     * 由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。
     *
     * @param message
     * @param messagePostProcessor
     */
    void sendDataToRabbitMQ(java.lang.Object message, MessagePostProcessor messagePostProcessor);

    /**
     * Convert a Java object to an Amqp Message and send it to a default exchange with a default routing key.
     * 由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。
     *
     * @param message
     * @param messagePostProcessor
     * @param correlationData
     */
    void sendDataToRabbitMQ(java.lang.Object message, MessagePostProcessor messagePostProcessor, CorrelationData correlationData);

    /**
     * Convert a Java object to an Amqp Message and send it to a default exchange with a specific routing key.
     * 由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。
     *
     * @param routingKey
     * @param message
     */
    void sendDataToRabbitMQ(java.lang.String routingKey, java.lang.Object message);

    /**
     * Convert a Java object to an Amqp Message and send it to a default exchange with a specific routing key.
     * 由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。
     *
     * @param routingKey
     * @param message
     * @param correlationData
     */
    void sendDataToRabbitMQ(java.lang.String routingKey, java.lang.Object message, CorrelationData correlationData);

    /**
     * Convert a Java object to an Amqp Message and send it to a default exchange with a specific routing key.
     * 由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。
     *
     * @param routingKey
     * @param message
     * @param messagePostProcessor
     */
    void sendDataToRabbitMQ(java.lang.String routingKey, java.lang.Object message, MessagePostProcessor messagePostProcessor);

    /**
     * Convert a Java object to an Amqp Message and send it to a default exchange with a specific routing key.
     * 由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。
     *
     * @param routingKey
     * @param message
     * @param messagePostProcessor
     * @param correlationData
     */
    void sendDataToRabbitMQ(java.lang.String routingKey, java.lang.Object message, MessagePostProcessor messagePostProcessor, CorrelationData correlationData);

    /**
     * Convert a Java object to an Amqp Message and send it to a specific exchange with a specific routing key.
     * 由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。
     *
     * @param exchange
     * @param routingKey
     * @param message
     */
    void sendDataToRabbitMQ(java.lang.String exchange, java.lang.String routingKey, java.lang.Object message);

    /**
     * Convert a Java object to an Amqp Message and send it to a specific exchange with a specific routing key.
     * 由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。
     *
     * @param exchange
     * @param routingKey
     * @param message
     * @param correlationData
     */
    void sendDataToRabbitMQ(java.lang.String exchange, java.lang.String routingKey, java.lang.Object message, CorrelationData correlationData);

    /**
     * Convert a Java object to an Amqp Message and send it to a specific exchange with a specific routing key.
     * 由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。
     *
     * @param exchange
     * @param routingKey
     * @param message
     * @param messagePostProcessor
     */
    void sendDataToRabbitMQ(java.lang.String exchange, java.lang.String routingKey, java.lang.Object message, MessagePostProcessor messagePostProcessor);

    /**
     * Convert a Java object to an Amqp Message and send it to a specific exchange with a specific routing key.
     * 由于配置了JSON转换，这里是将Java对象转换成JSON字符串的形式。
     *
     * @param exchange
     * @param routingKey
     * @param message
     * @param messagePostProcessor
     * @param correlationData
     */
    void sendDataToRabbitMQ(java.lang.String exchange, java.lang.String routingKey, java.lang.Object message, MessagePostProcessor messagePostProcessor, CorrelationData correlationData);

    Message messageBuil(Object handleObject, String msgId);

    String getMsgId();
}
