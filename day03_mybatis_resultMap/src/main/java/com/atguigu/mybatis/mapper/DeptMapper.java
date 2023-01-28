package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author xujian
 * @create 2023-01-08 16:56
 */
public interface DeptMapper {

    /**
     * 通过分布查询来获取员工以及其对应的部门信息，步骤2：
     * @param deptId
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 通过collection来获取部门信息以及其对应的员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 通过分布查询来获取部门信息以及其对应的员工信息，步骤1：
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepFirst(@Param("deptId") Integer deptId);
}
