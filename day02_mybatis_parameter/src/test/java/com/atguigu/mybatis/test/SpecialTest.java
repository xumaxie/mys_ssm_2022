package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SpecialMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author xujian
 * @create 2023-01-08 15:38
 */
public class SpecialTest {
    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        List<User> a = mapper.getUserByLike("a");
        a.forEach(System.out::println);
        sqlSession.close();
    }

//
    @Test
    public void testDeleteByID(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        mapper.deleteByID("7,8,9");
        sqlSession.close();
    }
    @Test
    public void testGetAllUserList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        List<User> t_user = mapper.getAllUserList("t_user");
        System.out.println(t_user);
        sqlSession.close();
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        User user = new User(null, "qwwe", "012012", 452, "男", "123456@163.com");
        mapper.insertUser(user);

        //添加前：没有id
        //添加操作后我们获取id
        Integer id = user.getId();
        System.out.println("id是"+id);
        System.out.println(user);

        sqlSession.close();
    }

}
