package com.ouyang.hello.spring.cloud.web.admin.feign.service;

import com.ouyang.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 通过 @FeignClient("服务名") 注解来指定调用哪个服务。不用再注解为Service
 * 增加 fallback 指定类,熔断时调用该类
 */
@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping("/hi")
    public String sayHi(@RequestParam("message") String message);

}
