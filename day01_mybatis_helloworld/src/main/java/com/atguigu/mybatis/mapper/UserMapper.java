package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * @author xujian
 * @create 2023-01-07 21:49
 */
public interface UserMapper {
    /**
     * 添加用户
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 查询单个用户
     * @return
     */
    User getUserById();

    /**
     * 查询所有用户
     * @return
     */
    List<User> getAllUser();
}
