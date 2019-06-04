package com.ouyang.hello.spring.cloud.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration  {

    @Bean
    //开启负载均衡注解
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
