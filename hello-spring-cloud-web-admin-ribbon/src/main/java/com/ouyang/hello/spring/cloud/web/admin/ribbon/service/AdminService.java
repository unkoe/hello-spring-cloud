package com.ouyang.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过 restTemplate 访问服务名和接口与 服务提供者进行通信，提供参数获取返回服务生产者controller的结果。
     * @HystrixCommand 注解并指定 fallbackMethod 熔断方法
     * @param message
     * @return
     */
    @HystrixCommand(fallbackMethod ="hiError")
    public String sayHi(String message) {
        return restTemplate.getForObject(
                "http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message=" + message, String.class);
    }

    public String hiError(String message) {
        return String.format("Hi,your message is: %s ,but request error", message);
    }
}
