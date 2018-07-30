package com.master.servicea.controller;

import com.master.servicea.feign.ServiceBClient;
import com.master.servicea.model.User;
import com.master.servicea.rabbitmq.SinkSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/service-a")
public class HelloController {

    @Autowired
    private ServiceBClient serviceBClient;

    @Autowired
    private SinkSender sinkSender;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }

    @RequestMapping(value = "/hello-b")
    @ResponseBody
    public String sayHelloFromB(){
        return serviceBClient.sayHelloFromB();
    }

    @RequestMapping(value = "/send")
    public void send(){
        User user = new User();
        user.setName("yiwenjie");
        user.setPwd("666666");
        sinkSender.output().send(MessageBuilder.withPayload(user).build());
    }

    @RequestMapping(value = "/sendTestSub")
    public void sendTestSub(){
        User user = new User();
        user.setName("sendTestSub");
        user.setPwd("666666");
        sinkSender.testSub().send(MessageBuilder.withPayload(user).build());
    }

}
