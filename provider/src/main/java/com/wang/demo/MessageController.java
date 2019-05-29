package com.wang.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @RequestMapping("/getMessage")
    public String getMessage(){
        return "provider 提供信息者：" + messageService.getMessage();
    }
}
