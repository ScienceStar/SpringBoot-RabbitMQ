package com.listener;

import com.rabbitmq.client.ConfirmCallback;
import org.slf4j.Logger;
import org.slf4j.*;
import org.springframework.amqp.rabbit.connection.CorrelationData;

import java.io.IOException;

/**
 * @ProjectName: SpringBoot-Mqtt
 * @Package: com.listener
 * @ClassName: NotifyConfirmCallBackListener
 * @Author: LXC
 * @Description: 消息确认回调类
 * @Date: 2021/4/22 12:02 pm
 */
public class NotifyConfirmCallBackListener implements ConfirmCallback {
    @Override
    public void handle(long l, boolean b) throws IOException {

    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Confirmation callback.
     *
     * @param correlationData correlation data for the callback.
     * @param ack             true for ack, false for nack
     * @param cause           An optional cause, for nack, when available, otherwise null.
     */
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        logger.info("延迟测试---确认消息完成-------->confirm--:correlationData:" + correlationData.getId() + ",ack:" + ack + ",cause:" + cause);
    }
}
