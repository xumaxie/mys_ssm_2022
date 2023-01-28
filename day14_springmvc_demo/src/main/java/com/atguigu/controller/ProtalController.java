package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xujian
 * @create 2023-01-13 14:23
 * 首页（Protal）
 */


@Controller
public class ProtalController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
