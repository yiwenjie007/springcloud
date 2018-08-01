package com.taipu.servicea.controller;

import com.taipu.servicea.enums.RedisCacheKeyEnum;
import com.taipu.servicea.feign.ServiceBClient;
import com.taipu.servicea.model.User;
import com.taipu.servicea.rabbitmq.SinkSender;
import com.taipu.servicea.util.RedisFinalUtil;
import com.taipu.servicea.util.RedisUtil;
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

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RedisFinalUtil redisFinalUtil;

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

    @RequestMapping(value = "/sendTestSub")
    public void sendTestSub(){
        User user = new User();
        user.setName("sendTestSub");
        user.setPwd("666666");
        sinkSender.testSub().send(MessageBuilder.withPayload(user).build());
    }

    @RequestMapping(value = "/set")
    public void setValue(){
        redisUtil.setValue("key","yiwenjie");
        System.out.println("设置缓存成功");
    }

    @RequestMapping(value = "/setNewValue")
    public void setNewValue(){
        User user = new User();
        user.setName("redis");
        redisFinalUtil.setValue(user,RedisCacheKeyEnum.test);
        System.out.println("设置缓存成功");
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public String getValue(){
        return redisUtil.getValue("key");
    }

    @RequestMapping(value = "/getNewValue")
    @ResponseBody
    public User getNewValue(){
        User user =  redisFinalUtil.getValue(RedisCacheKeyEnum.test);
        return user;
    }

}
