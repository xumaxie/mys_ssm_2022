package com.atguigu.service;

import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.pojo.Employee;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xujian
 * @create 2023-01-28 11:03
 */
public interface EmployeeService {

    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
