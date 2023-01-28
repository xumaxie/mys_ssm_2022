package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;

/**
 * @author xujian
 * @create 2023-01-10 9:50
 */
public class UserContrller {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void saveUser(){
        userService.saveUser();
    }
}
