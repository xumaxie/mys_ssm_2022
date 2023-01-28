package com.atguigu.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author xujian
 * @create 2023-01-09 21:53
 */
public class DataSourceTest {
    @Test
    public void testFour() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource dataSource = ioc.getBean("dataSource", DruidDataSource.class);
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
