package com.bigguy.code;

import com.bigguy.code.component.Example;
import com.bigguy.code.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bigguy_hc
 * @create 2020-02-02 16:11
 * @description：
 */
public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Example example = context.getBean(Example.class);

        System.out.println(example);

    }
}
