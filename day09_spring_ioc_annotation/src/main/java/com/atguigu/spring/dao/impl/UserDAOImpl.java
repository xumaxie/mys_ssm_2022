package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDAO;
import org.springframework.stereotype.Repository;

/**
 * @author xujian
 * @create 2023-01-10 12:59
 */
@Repository
public class UserDAOImpl implements UserDAO {
    @Override
    public void save() {
        System.out.println("保存成功");
    }
}
