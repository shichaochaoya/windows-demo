package com.wang.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/show")
    public String showMessage(){
        // 服务提供者url、返回数据类型
        String s = restTemplate.getForObject("http://provider-message/getMessage", String.class);
        return "consumer获取信息："+s;
    }
}