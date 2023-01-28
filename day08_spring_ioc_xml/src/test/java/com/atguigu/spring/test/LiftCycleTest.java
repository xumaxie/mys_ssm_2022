package com.atguigu.spring.test;

import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xujian
 * @create 2023-01-09 22:23
 */
public class LiftCycleTest {

    @Test
    public void testTwo(){
        ConfigurableApplicationContext ioc3 = new ClassPathXmlApplicationContext("spring-lifecycle.xml");

        User bean = ioc3.getBean(User.class);
        System.out.println(bean);
//        生命周期：1、创建对象
//        生命周期：2、依赖注入
//        初始化之前--》postProcessBeforeInitialization
//        生命周期：3、初始化
//        初始化之后--》postProcessAfterInitialization
    }
    @Test
    public void testOne(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
//        ClassPathXmlApplicationContext ioc2 = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        ConfigurableApplicationContext ioc3 = new ClassPathXmlApplicationContext("spring-lifecycle.xml");

//        User bean = ioc3.getBean(User.class);
//        System.out.println(bean);
////        ioc2.close();
//        ioc3.close();
    }
}
