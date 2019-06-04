package com.ouyang.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    /**
     * 此实例的服务生产者通过接口与消费者进行通信
     * @param message 消息
     * @return
     */
    //http://localhost:8762/hi?message=HelloSpringCloud
    @GetMapping("/hi")
    public String sayHi(@RequestParam(value = "message") String message) {
        return String.format(
                "Hi,your message is: %s i am form port: %s"
                , message, port);
    }
}
