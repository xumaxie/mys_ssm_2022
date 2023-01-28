package com.atguigu.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author xujian
 * @create 2023-01-09 22:06
 */
public class ScopeTest {


    @Test
    public void testFour() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        Student s1 = ioc.getBean("scopeTest", Student.class);

        Student s2 = ioc.getBean("scopeTest", Student.class);

        //判断s1和s2是不是同一个对象
        System.out.println(s1==s2);//true
        //或者equals方法也可以
        System.out.println(s1.equals(s2));//true
    }
}
