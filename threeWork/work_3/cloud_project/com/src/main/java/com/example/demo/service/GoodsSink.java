package com.example.demo.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface GoodsSink {

    String GOODS_INPUT = "goods_input";

    @Input(GoodsSink.GOODS_INPUT)
    SubscribableChannel input();

}
