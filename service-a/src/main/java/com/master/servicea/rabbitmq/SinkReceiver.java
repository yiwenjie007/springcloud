package com.master.servicea.rabbitmq;

import com.master.servicea.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(value = {SinkSender.class})
public class SinkReceiver {

    public static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(SinkSender.INPUT)
    public void receiveFromB(User user){
        logger.info("Received from B: " + user.getName());
    }

    @StreamListener(SinkSender.sub)
    public void testSub(User user){
        logger.info("Received: " + user.getName());
    }

    @StreamListener(SinkSender.OUT_PUT)
    public void getInfo(User user){
        logger.info("Received: " + user.getName());
    }
}
