package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author xujian
 * @create 2023-01-08 11:15
 */
public interface UserMapper {

    /**
     * 通过用户名获取用户
     * @param username
     * @return
     */
    User getUserByName(String username);

    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username,String password);


    /**
     *验证登录
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String,Object> map);

    /**
     * 插入user
     * @param user
     */
    void insertUser(User user);

    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParm(@Param(value = "username") String username, @Param(value = "password") String password);
}
