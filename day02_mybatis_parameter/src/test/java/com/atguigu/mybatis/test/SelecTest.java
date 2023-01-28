package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author xujian
 * @create 2023-01-08 14:28
 */
public class SelecTest {
    @Test
    public void getUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        User userById = selectMapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();

    }

    @Test
    public void testgetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        List<User> allUser = selectMapper.getAllUser();
//        System.out.println(allUser);
        allUser.forEach(System.out::println);
        sqlSession.close();
    }
    @Test
    public void testCount(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        int count= selectMapper.getCount();
        System.out.println(count);
        sqlSession.close();
    }

    @Test
    public void testGetUserMapById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> userMap = selectMapper.getUserMapById(1);
        System.out.println(userMap);
        sqlSession.close();
    }

    @Test
    public void testGetAllUserMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> allUserMap = selectMapper.getAllUserMap();
        System.out.println(allUserMap);
        sqlSession.close();
    }
}
