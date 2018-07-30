package com.master.serviceb.controller;

import com.master.serviceb.rabbitmq.SinkSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/service-b")
public class ServiceBController {

    @Autowired
    private SinkSender sinkSender;

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    @ResponseBody
    public String sayHello(){
        return "hello-b";
    }

    @RequestMapping(value = "/send")
    public void send(){
        sinkSender.output().send(MessageBuilder.withPayload("From SinkSender").build());
    }
}
