package com.ouyang.hello.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 通过 @EnableDiscoveryClient 注解注册到服务中心
 * @EnableHystrix 注解开启熔断机制
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class WebAdminRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class, args);
    }
}
