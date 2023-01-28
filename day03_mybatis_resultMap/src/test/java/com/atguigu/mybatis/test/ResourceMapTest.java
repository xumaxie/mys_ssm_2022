package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author xujian
 * @create 2023-01-08 17:10
 */
public class ResourceMapTest {
    @Test
    public void TestGetEmpByID(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByID = mapper.getEmpByID(1);
        System.out.println(empByID);
        sqlSession.close();
    }


    @Test
    public void TestGetEmpAndDeptByEmpId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByEmpId = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(empAndDeptByEmpId);
        sqlSession.close();
    }

    @Test
    public void TestGetEmpAndDeptByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByEmpId = mapper.getEmpAndDeptByStep(2);
        System.out.println(empAndDeptByEmpId.getAge());
        sqlSession.close();
    }

    @Test
    public void TestGetDeptAndEmpByDeptId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByStepFirst = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(deptAndEmpByStepFirst);
        sqlSession.close();
    }

    @Test
    public void TestGetDeptAndEmpByDeptByStepId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByStepFirst = mapper.getDeptAndEmpByStepFirst(1);
        System.out.println(deptAndEmpByStepFirst);
        sqlSession.close();
    }
}
