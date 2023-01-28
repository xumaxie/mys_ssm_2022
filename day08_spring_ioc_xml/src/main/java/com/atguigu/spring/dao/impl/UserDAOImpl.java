package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDAO;

/**
 * @author xujian
 * @create 2023-01-10 9:52
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void save() {
        System.out.println("保存成功");
    }
}
