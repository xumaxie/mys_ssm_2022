package com.atgui.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

/**
 * @author xujian
 * @create 2023-01-09 14:15
 */
public class MBGtest {
    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //查询所有数据
//        select emp_id, emp_name, age, gender, dept_id from t_emp
        List<Emp> emps = mapper.selectByExample(null);
        emps.forEach(System.out::println);

        //根据条件查询
//        Preparing: select emp_id, emp_name, age, gender, dept_id from t_emp WHERE ( age = ? )
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andAgeEqualTo(343);
        List<Emp> emps1 = mapper.selectByExample(empExample);
        emps1.forEach(System.out::println);

//        Preparing: select emp_id, emp_name, age, gender, dept_id from t_emp WHERE ( age = ? ) or( age is null )
        EmpExample empExample2 = new EmpExample();
        empExample2.createCriteria().andAgeEqualTo(343);
        empExample2.or().andAgeIsNull();
        List<Emp> emps2 = mapper.selectByExample(empExample2);
        emps2.forEach(System.out::println);
        sqlSession.close();
    }
}
