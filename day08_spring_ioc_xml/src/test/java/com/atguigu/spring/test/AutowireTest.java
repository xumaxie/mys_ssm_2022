package com.atguigu.spring.test;

import com.atguigu.spring.controller.UserContrller;
import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xujian
 * @create 2023-01-10 10:00
 */
public class AutowireTest {
    @Test
    public void testOne(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-javaweb.xml");
        UserContrller con = ioc.getBean(UserContrller.class);
        con.saveUser();
    }

}
