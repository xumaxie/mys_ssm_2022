package com.atguigu.controller;

import com.atguigu.pojo.Employee;
import com.atguigu.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xujian
 * @create 2023-01-28 11:01
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/page/{pageNum}")
    public String getEmployeeList(Model model, @PathVariable("pageNum") Integer pageNum){
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        model.addAttribute("page", page);
        return "employees";
    }


}
