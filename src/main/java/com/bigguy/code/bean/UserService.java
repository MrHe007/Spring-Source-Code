package com.bigguy.code.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author bigguy_hc
 * @create 2020-02-02 10:57
 * @description：
 */
@Component
@Scope(value = "prototype")
public class UserService {

    public UserService(){
        System.out.println("userService init...");
    }

    public void queryList(){
        System.out.println("queryList");
    }
}
