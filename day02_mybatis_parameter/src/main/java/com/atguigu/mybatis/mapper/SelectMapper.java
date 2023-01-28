package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author xujian
 * @create 2023-01-08 14:26
 */
public interface SelectMapper {

    /**
     * 根据id获取User
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 获取所有用户
     * @return
     */
    List<User> getAllUser();

    /**
     * 计数
     * @return
     */
    int getCount();

    /**
     * 通过id获取User对应的map集合
     * @return
     */
    Map<String,Object> getUserMapById(@Param("id") Integer id);

    /**
     * 获取所有User对应的map集合
     * @return
     */
    @MapKey("id")
    Map<String,Object> getAllUserMap();
//    Map<String,Object> getAllUserMap();
//    List<Map<String,Object>> getAllUserMap();

}
