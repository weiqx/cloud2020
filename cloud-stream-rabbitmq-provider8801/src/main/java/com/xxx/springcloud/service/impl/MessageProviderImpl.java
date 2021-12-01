package com.xxx.springcloud.service.impl;
//2021-11-29

import com.xxx.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

// 定义消息推送管道
@EnableBinding(Source.class)  // 不写  @service ， 而是去调用消息中间件的service
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;  // 消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("======== serial: " + serial);
        return null;
    }
}
