package com.master.serviceb.controller;

import com.master.serviceb.model.User;
import com.master.serviceb.rabbitmq.SinkSender;
import com.master.serviceb.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/service-b")
public class ServiceBController {

    @Autowired
    private SendService sendService;

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    @ResponseBody
    public String sayHello(){
        return "hello-b";
    }

    @RequestMapping(value = "/send")
    public void send(){
        sendService.send();
    }
}
