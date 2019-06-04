package com.ouyang.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.ouyang.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * 创建熔断器类并实现对应的 Feign 接口
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi,your message is: %s,but request error", message);
    }
}
