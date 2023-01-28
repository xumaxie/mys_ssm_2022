package com.atguigu.spring.test;

import com.atguigu.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xujian
 * @create 2023-01-09 16:29
 */
public class HelloWorldTest {
    @Test
    public void test(){
        //1.获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.后去ioc容器中的bean(这个过程中，我们就是让spring创建的类对象)
        HelloWorld hello = (HelloWorld) ioc.getBean("hello");//使用的bean标签的id属性作为name
        hello.sayHello();

    }
}
