package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.UserDAO;
import com.atguigu.spring.service.UserService;

/**
 * @author xujian
 * @create 2023-01-10 9:51
 */
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }


    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Override
    public void saveUser() {
        userDAO.save();
    }
}
