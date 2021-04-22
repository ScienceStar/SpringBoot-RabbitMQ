package com.controller;

import com.config.RabbitMQConfig;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

/**
 * @ClassName SendMsgController
 * @Description: TODO
 * @Author lxc
 * @Date 2020/8/1 21:55
 * @Version V1.0
 **/
@RestController
public class SendMsgController {
    //注入RabbitMQ的模板
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 测试
     */
    @RequestMapping("/sendmsg")
    public String sendMsg(@RequestParam String msg, @RequestParam String key) {
        /**
         * 发送消息
         * 参数一：交换机名称
         * 参数二：路由key: item.springboot-rabbitmq,符合路由item.#规则即可
         * 参数三：发送的消息
         */

        //设置消息过期时间
        MessageProperties messageProperties = new MessageProperties();
        Message message = new Message(msg.getBytes(StandardCharsets.UTF_8),messageProperties);
        message.getMessageProperties().setExpiration("18000");
        rabbitTemplate.convertAndSend(RabbitMQConfig.ITEM_TOPIC_EXCHANGE, key, message);
        //返回消息
        return "发送消息成功！";
    }
}
