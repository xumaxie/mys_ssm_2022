package com.atguigu.spring.aop.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * @author xujian
 * @create 2023-01-11 9:15
 */
public class LoggerAspectTest {
    @Test
    public void testBefore(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator bean = ioc.getBean(Calculator.class);
        int add = bean.add(2, 3);
    }
    @Test
    public void testAfter(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator bean = ioc.getBean(Calculator.class);
        bean.div(2, 0);
    }
}
