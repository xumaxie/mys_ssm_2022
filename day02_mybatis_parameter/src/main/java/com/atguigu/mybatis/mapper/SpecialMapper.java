package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xujian
 * @create 2023-01-08 15:15
 *
 * 1.特殊SQL的执行（不能使用#{}）
 *  1.1 模糊查询 like
 *  1.2 批量删除 delete
 *  1.3 动态设置表名
 *  1.4 添加功能获取自增的主键
 */
public interface SpecialMapper {

    /**
     * 通过模糊查询获取名字中有字符串targetStr的User的list
     * @return
     */
    List<User> getUserByLike(@Param("targetStr") String targetStr);

    /**
     * 通过id批量删除
     * @param ids
     */
    void deleteByID(@Param("ids") String ids);


    /**
     * 获取指定表的数据
     * @param tablename
     * @return
     */
    List<User> getAllUserList(@Param("tablename") String tablename);


    /**
     * 添加对象
     * @param user
     */
    void insertUser(User user);//因为user是一个我们的实体类，这里无需@Param
}
