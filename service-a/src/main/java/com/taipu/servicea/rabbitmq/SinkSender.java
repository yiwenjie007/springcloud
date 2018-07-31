package com.taipu.servicea.rabbitmq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SinkSender {

    String sub = "sub";

    String OUT_PUT = "output";

    String INPUT = "input";

    @Input(INPUT)
    MessageChannel input();

    @Output(OUT_PUT)
    MessageChannel sendTo();

    @Input(sub)
    SubscribableChannel testSub();
}
