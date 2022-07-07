package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(GoodsSink.class)
@Slf4j
public class GoodsConsumer {

    @StreamListener(GoodsSink.GOODS_INPUT)
    public void onReceive(String shopJson) {
        log.info(shopJson);
    }
}