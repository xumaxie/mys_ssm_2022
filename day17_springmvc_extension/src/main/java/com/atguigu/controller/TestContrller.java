package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xujian
 * @create 2023-01-15 16:54
 */
@Controller
public class TestContrller {
    @GetMapping("/test/demo01")
    public String testOne(){
        System.out.println(1/0);
        return "success";
    }

    @GetMapping("/test/interceptor")
    public String testInterceptor(){

        return "success";
    }
}
