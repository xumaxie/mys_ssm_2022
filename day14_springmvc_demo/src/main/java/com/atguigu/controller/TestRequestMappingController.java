package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author xujian
 * @create 2023-01-13 14:23
 */
@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {
    //此时控制器所匹配的请求的请求路径为：
    //  http://localhost:8080/xj02/test/hello
    @RequestMapping(value = {"/method1","method2"}
                    ,method = {RequestMethod.GET,RequestMethod.POST}
//                    ,method = RequestMethod.POST
                    ,params = {"username"}
                    )
    public String success(){
        return "success";
    }

    @RequestMapping("/**/test/ant")
    public String antTest(){
        return "success";
    }

    @RequestMapping("/test/rest/{username}/{id}")
    public String restTest(@PathVariable Integer id, @PathVariable String username){
        System.out.println("用户id为："+id+",用户名为："+username);
        return "success";
    }


    @RequestMapping("/test/pojo")
    public String pojoTest(User user){
        System.out.println(user); //User{username='rhfoovuk', password='123', sex='??·', age=12, email='xjqq.com'}
        return "success";
    }
}

