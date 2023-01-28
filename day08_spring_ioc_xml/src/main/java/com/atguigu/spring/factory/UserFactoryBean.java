package com.atguigu.spring.factory;

import com.atguigu.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author xujian
 * @create 2023-01-10 9:26
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
//        return new User(1,"xi","123",23);
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
