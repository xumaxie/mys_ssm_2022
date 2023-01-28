package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xujian
 * @create 2023-01-14 21:09
 */
@Controller
public class TestAjaxController {


//    @PostMapping("/test/RequestBody/json")
//    public void testRequestBody(@RequestBody User user, HttpServletResponse response) throws IOException {
//        System.out.println(user);
//        response.getWriter().write("收到你传递的User对象");

//    }
    @PostMapping("/test/RequestBody/json")
    public void testRequestBody(@RequestBody Map<String,Object> map, HttpServletResponse response) throws IOException {
        System.out.println(map);
        response.getWriter().write("收到你传递的User对象");

    }

    @RequestMapping("/test/ResponseBody")
    @ResponseBody
    public String ResponseBody(){
        return "success";  //此时这个success不是视图，而是将该返回值作为响应报文的响应体返回给浏览器
    }


//    @RequestMapping("/test/ResponseBody/json")
//    @ResponseBody
//    public User testResponseBodyJsonUser(){
//        User user1 = new User(1001, "admin1", "123456", 20, "男");
//        return user1;
//    }

//    @RequestMapping("/test/ResponseBody/json")
//    @ResponseBody
//    public List<User> testResponseBodyJson(){
//        User user1 = new User(1001, "admin1", "123456", 20, "男");
//        User user2 = new User(1002, "admin2", "123456", 20, "男");
//        User user3 = new User(1003, "admin3", "123456", 20, "男");
//        List<User> list = Arrays.asList(user1, user2, user3);
//        return list;
//    }
    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
    public Map<String, Object> testResponseBodyJson(){
        User user1 = new User(1001, "admin1", "123456", 20, "男");
        User user2 = new User(1002, "admin2", "123456", 20, "男");
        User user3 = new User(1003, "admin3", "123456", 20, "男");
        Map<String, Object> map = new HashMap<>();
        map.put("1001", user1);
        map.put("1002", user2);
        map.put("1003", user3);
        return map;
    }


}
