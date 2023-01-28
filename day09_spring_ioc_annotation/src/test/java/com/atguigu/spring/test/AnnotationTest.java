package com.atguigu.spring.test;

import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.dao.impl.UserDAOImpl;
import com.atguigu.spring.sercice.UserService;
import com.atguigu.spring.sercice.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author xujian
 * @create 2023-01-10 13:10
 */
public class AnnotationTest {
    @Test
    public void testOne(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("sqring-annotation.xml");
        UserController controllerBean = ioc.getBean(UserController.class);
        UserController controllerBean2 = ioc.getBean("userController",UserController.class);
        UserServiceImpl serviceBean = ioc.getBean(UserServiceImpl.class);
        UserDAOImpl daoBean = ioc.getBean(UserDAOImpl.class);

        System.out.println(controllerBean);
        System.out.println(controllerBean2);
        System.out.println(serviceBean);
        System.out.println(daoBean);

    }
    @Test
    public void testtwo(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("sqring-annotation.xml");
        UserController controllerBean = ioc.getBean(UserController.class);
        controllerBean.saveUser();
    }
}
