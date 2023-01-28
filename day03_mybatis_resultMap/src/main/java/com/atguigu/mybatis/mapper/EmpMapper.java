package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xujian
 * @create 2023-01-08 16:56
 */
public interface EmpMapper {

    Emp getEmpByID(@Param("empId") Integer empId);

    /**
     * 通过emp_id获取员工以及其对应的部门信息
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 通过分布查询来获取员工以及其对应的部门信息，步骤1：
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStep(@Param("empId") Integer empId);

    /**
     * 通过分布查询来获取部门以及其对应的员工的信息，步骤2：
     * @param deptId
     * @return
     */
    List<Emp> getDeptAndEmpByStep(@Param("deptId") Integer deptId);

}
