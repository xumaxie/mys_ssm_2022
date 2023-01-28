package com.atguigu.pojo;

import org.springframework.stereotype.Repository;

/**
 * @author xujian
 * @create 2023-01-28 10:58
 *     emp_id（非空 自增 主键）  int(11)
 *     emp_name（默认值为null）  varchar(20)
 *     age（默认值为null）       int(11)
 *     gender（默认值为null）       char(1)
 *     email（默认值为null）     varchar(50)
 */
public class Employee {
    private int empId;
    private String empName;
    private int age;
    private String sex;
    private String email;

   public Employee(){}

    public Employee(int empId, String empName, int age, String sex, String email) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
