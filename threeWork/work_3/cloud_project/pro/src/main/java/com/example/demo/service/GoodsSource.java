package com.example.demo.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface GoodsSource {

    String GOODS_OUTPUT = "goods_output";

    @Output(GoodsSource.GOODS_OUTPUT)
    MessageChannel output();

}
