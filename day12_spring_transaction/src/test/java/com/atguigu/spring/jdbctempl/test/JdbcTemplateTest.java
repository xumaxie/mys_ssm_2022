package com.atguigu.spring.jdbctempl.test;

import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author xujian
 * @create 2023-01-11 15:08
 * 这里我们使用spring整合的junit
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JdbcTemplateTest {

//    DI依赖注入的方式有多种，我们使用自动装配
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUnpdat(){
        String sql = "insert into t_user values(null,?,?,?,?,?)";
        jdbcTemplate.update(sql,"kk","123abc",45,"女","456@163.com");
        System.out.println();
    }

    @Test
    public void testSelectById(){
        String sql ="select * from t_user where id=?";
        //jdbcTemplate.queryForObject
//            //BeanPropertyRowMapper
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
    }

    @Test
    public void testGetAlluser(){
        String sql ="select * from t_user";
        //jdbcTemplate.query
//            //BeanPropertyRowMapper
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        query.forEach(System.out::println);
    }

    @Test
    public void testSpecialQuery(){
        String sql="select count(*) from t_user";

        //jdbcTemplate.queryForObject(String sql, Class<T> requiredType)
        //jdbcTemplate.queryForObject(String sql, Class<T> requiredType,args)
        /**
         * class<T>是指返回值的类型
         * args是指占位符的赋值
         */
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }

}
