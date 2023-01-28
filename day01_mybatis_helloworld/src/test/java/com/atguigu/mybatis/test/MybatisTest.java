package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author xujian
 * @create 2023-01-07 22:00
 */
public class MybatisTest {

    @Test
    public void testInsert() throws IOException {
        //获取核心配置文件的输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory对象
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        //获取sql的会话对象sqlSession，是Mybatis提供的操作数据库的对象
//        SqlSession sqlSession = build.openSession();
        SqlSession sqlSession = build.openSession(true);

        //获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        int result = sqlSession.insert("com.atguigu.mybatis.mapper.UserMapper.insertUser");

        //调用mapper接口的方法，实现添加用户信息的功能
        int result = mapper.insertUser();
        //提交事务
//        sqlSession.commit();
        //
        System.out.println("结果是ssss："+result);
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser();

        sqlSession.close();
    }

    @Test
    public void testQuery(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById();
        System.out.println(user);

        sqlSession.close();
    }
    @Test
    public void testQueryAll(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> allUser = mapper.getAllUser();
        System.out.println(allUser);

        sqlSession.close();
    }

}
