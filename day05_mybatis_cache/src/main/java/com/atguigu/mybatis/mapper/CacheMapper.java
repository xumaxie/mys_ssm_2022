package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author xujian
 * @create 2023-01-09 10:25
 */
public interface CacheMapper {

    /**
     * 根据id查询Emp
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);
}
