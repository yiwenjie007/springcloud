package com.master.serviceb.service;

import com.master.serviceb.model.User;
import com.master.serviceb.rabbitmq.SinkSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(value = SinkSender.class)
public class SendService {

    @Autowired
    private SinkSender sinkSender;

    public void send(){
        User user = new User();
        user.setName("service-b");
        sinkSender.output().send(MessageBuilder.withPayload(user).build());
    }
}
