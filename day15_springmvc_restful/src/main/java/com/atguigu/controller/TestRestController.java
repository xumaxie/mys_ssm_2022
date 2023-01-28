package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xujian
 * @create 2023-01-14 12:28
 * @descripe:
 *  1.查看所有用户的信息 /user---->get
 *  2.根据id查看用户信息 /user/1---->get
 *  3.添加用户的信息 /user---->post
 *  4.更新用户的信息 /user---->put
 *  5.删除用户的信息 /user/1---->delete
 */
@Controller
public class TestRestController {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String testOne(){
        System.out.println("查看所有用户的信息 /user---->get");
        return "success";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String testTwo(@PathVariable Integer id){
        System.out.println("2.根据id查看用户信息 /user/1---->get,id为"+id);
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String testThree(){
        System.out.println("3.添加用户的信息 /user---->post");
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String testFour(){
        System.out.println("4.更新用户的信息 /user---->put");
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String testFive(){
        System.out.println("5.删除用户的信息 /user/1---->delete");
        return "success";
    }
}
