package com.master.serviceb.rabbitmq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SinkSender {

    String sub = "sub";

    String OUT_PUT = "output";

    String INPUT = "input";

    @Output(SinkSender.INPUT)
    MessageChannel output();

    @Output(OUT_PUT)
    MessageChannel sendTo();

    @Input(sub)
    SubscribableChannel testSub();
}
