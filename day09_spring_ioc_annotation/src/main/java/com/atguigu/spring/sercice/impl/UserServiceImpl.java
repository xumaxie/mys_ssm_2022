package com.atguigu.spring.sercice.impl;

import com.atguigu.spring.dao.UserDAO;
import com.atguigu.spring.sercice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xujian
 * @create 2023-01-10 12:59
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public void saveUser() {
        userDAO.save();
    }
}
