package com.atguigu.controller;

import com.atguigu.dao.EmployeeDao;
import com.atguigu.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author xujian
 * @create 2023-01-14 14:24
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/employee")
    public String getEmployeeList(Model model) {
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("employeeList", all);
        //转发
        return "employee_list";
    }

//    @DeleteMapping("/employee/{id}")
//    public String deleteEmpById(@PathVariable Integer id){
//        employeeDao.delete(id);
//        return "redirect:/employee_list";
//    }

    @PostMapping("/employee")
    public String addEmp(Employee employee) {
        employeeDao.save(employee);
        //重定向到列表功能/employee
        return "redirect:/employee";
    }

    @GetMapping("/employee/{id}")
    public String toUpdate(@PathVariable Integer id, Model model) {
        Employee employee = employeeDao.get(id);
        //我们需要把对象共享到域对象
        model.addAttribute("employee", employee);
        return "employee_update";
    }
    @PutMapping("employee")
    public String updateEmp(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/employee";
    }
    @DeleteMapping("/employee/{id}")
    public String deleteEmp(@PathVariable Integer id) {
        employeeDao.delete(id);
        //我们需要把对象共享到域对象
        return "redirect:/employee";
    }
}
