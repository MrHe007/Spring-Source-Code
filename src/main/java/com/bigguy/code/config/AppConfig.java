package com.bigguy.code.config;

import com.bigguy.code.bean.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author bigguy_hc
 * @create 2020-02-02 10:57
 * @description：
 */
@Configuration
@ComponentScan("com.bigguy.code")
public class AppConfig {

    @Bean
    public UserService userService(){
        return new UserService();
    }
}
