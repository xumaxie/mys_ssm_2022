package com.atguigu.spring.controller;

import com.atguigu.spring.sercice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author xujian
 * @create 2023-01-10 12:58
 */
@Controller
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;
    public void saveUser(){
        userService.saveUser();
    }
}
