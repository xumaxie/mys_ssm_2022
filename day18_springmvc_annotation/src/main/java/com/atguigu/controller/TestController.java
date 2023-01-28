package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xujian
 * @create 2023-01-16 10:20
 */
@Controller
public class TestController {

    @GetMapping("/test")
    public String test(){
        System.out.println(1/0);
        return  "index";
    }
}
