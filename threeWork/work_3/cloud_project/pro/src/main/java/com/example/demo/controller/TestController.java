package com.example.demo.controller;

import com.example.demo.service.GoodsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private GoodsProducer goodsProducer;

    @GetMapping("/send")
    public void get(){
        goodsProducer.sendMessage("我发送了一条消息");
    }

}