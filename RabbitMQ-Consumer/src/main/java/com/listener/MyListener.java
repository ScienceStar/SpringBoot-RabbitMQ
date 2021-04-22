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
        StringBuffer stringBuffer = new StringBuffer();
        //TODO 这里可以做异步的工作

        String[] strings = msg.split(",");

        for (String s : strings) {
            stringBuffer.append((char) Integer.parseInt(s));
        }
        System.out.println(stringBuffer.toString());
    }

}
