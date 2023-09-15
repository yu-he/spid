package com.yuhe.spid.web.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorTestController {
    @GetMapping("/interceptor")
    public String index(){
        return "拦截器测试";
    }
}
