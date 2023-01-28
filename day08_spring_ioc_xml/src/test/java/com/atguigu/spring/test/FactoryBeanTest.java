package com.atguigu.spring.test;

import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xujian
 * @create 2023-01-10 9:30
 */
public class FactoryBeanTest {
    @Test
    public void testUserFactoryBean(){
        //获取IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-factory.xml");
        User user = (User) ac.getBean(User.class);
        System.out.println(user);
        /*生命周期：1、创建对象
        User{id=null, username='null', password='null', age=null}*/
    }
}
