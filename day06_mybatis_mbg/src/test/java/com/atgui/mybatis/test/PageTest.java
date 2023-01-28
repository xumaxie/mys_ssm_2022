package com.atgui.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author xujian
 * @create 2023-01-09 14:32
 */
public class PageTest {
    @Test
    public void testPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //开启分页
        Page<Object> objects = PageHelper.startPage(2, 5);
        List<Emp> emps = mapper.selectByExample(null);
//        emps.forEach(System.out::println);
        PageInfo<Emp> empPageInfo = new PageInfo<>(emps, 5);//第二个参数navigatePages


        System.out.println(empPageInfo);
        //分析其内部执行两条sql
        //1.SELECT count(0) FROM t_emp
        //2.select emp_id, emp_name, age, gender, dept_id from t_emp LIMIT ?, ?
        sqlSession.close();
    }
}
