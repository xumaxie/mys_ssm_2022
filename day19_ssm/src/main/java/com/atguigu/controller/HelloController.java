package com.atguigu.controller;

import com.atguigu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author xujian
 * @create 2023-01-20 11:54
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;
}
