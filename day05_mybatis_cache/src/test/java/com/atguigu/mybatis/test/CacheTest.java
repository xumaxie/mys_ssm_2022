package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.CacheMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xujian
 * @create 2023-01-09 10:25
 */
public class CacheTest {

//    Emp getEmpById(@Param("empId") Integer empId);
    @Test
    public void testGetEmpById(){
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp empById = mapper1.getEmpById(1);
        System.out.println(empById);

        //此时会从一级缓存中找
        Emp empById2 = mapper1.getEmpById(1);
        System.out.println(empById2);

        //因为sqlSession变化，所有不会缓存中找，而是执行sql
        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp empById3 = mapper2.getEmpById(1);
        System.out.println(empById3);
    }

    @Test
    public void testErjiCache(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory build = sqlSessionFactoryBuilder.build(stream);
            //sqlSession1
            SqlSession sqlSession1 = build.openSession(true);
            CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
            Emp emp1 = mapper1.getEmpById(1);
            System.out.println(emp1);
            sqlSession1.close();
            //sqlSession2
            SqlSession sqlSession2 = build.openSession(true);
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);

            Emp emp2 = mapper2.getEmpById(1);
            System.out.println(emp2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
