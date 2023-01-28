package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper01;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author xujian
 * @create 2023-01-09 8:31
 */
public class EmpDynamicTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper01 mapper = sqlSession.getMapper(EmpMapper01.class);
        Emp emp = new Emp(null,"xjj",20,"男");
        List<Emp> empByCondition = mapper.getEmpByCondition(emp);
        System.out.println(empByCondition);
        sqlSession.close();
    }
}
