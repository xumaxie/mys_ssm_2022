package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xujian
 * @create 2023-01-13 9:35
 */

@Controller
public class HelloController {

    /**
     *如果访问：http://localhost:8080/"applicationContext"/就跳转到index.html去
     * @return
     */
    @RequestMapping("/")
    public String acceptHelloXj01(){
        //返回逻辑视图
        return "index";   // /WEB-INF/templates/index.html
    }

    /**
     * 解决：如果访问：http://localhost:8080/"applicationContext"/hello时，如何处理
     * @return
     */
//    @RequestMapping("/hello")
//    public String hello(){
//        return "success";
//    }
    @RequestMapping("/helloworld")
    public String HelloWorld() {
        return "success";
    }
}
