package com.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyListener
 * @Description: TODO
 * @Author lxc
 * @Date 2020/8/1 22:15
 * @Version V1.0
 **/
@Component
public class MyListener {
    @RabbitListener(queues = "item_queue")
    public void msg(String msg) {
        System.out.println("消费者消费消息了：" + msg);
        //TODO 这里可以做异步的工作
    }

}
