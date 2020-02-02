package com.bigguy.code.component;

import com.bigguy.code.entity.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author bigguy_hc
 * @create 2020-02-02 20:53
 * @description：
 */

@Component
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
