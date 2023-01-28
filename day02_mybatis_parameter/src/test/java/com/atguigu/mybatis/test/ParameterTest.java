package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;

/**
 * @author xujian
 * @create 2023-01-08 13:12
 */
public class ParameterTest {

    @Test
    public void testGetUserByName(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root = mapper.getUserByName("root");
        System.out.println(root);
        sqlSession.close();

    }

    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root = mapper.checkLogin("xj","000");
        System.out.println(root);
        sqlSession.close();
    }
    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("username", "root");
        map.put("password", "123");
        User root = mapper.checkLoginByMap(map);
        System.out.println(root);
        sqlSession.close();
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(0,"xlx","010101",23,"男","26931@qq.com");
        mapper.insertUser(user);
        sqlSession.close();
    }
    @Test
    public void testCheckLoginByParm(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userLogin = mapper.checkLoginByParm("root", "123");
        System.out.println(userLogin);
        sqlSession.close();
    }
}
