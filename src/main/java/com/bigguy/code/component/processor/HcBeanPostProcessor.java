package com.bigguy.code.component.processor;

import com.bigguy.code.component.Example;
import com.bigguy.code.component.Example2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author bigguy_hc
 * @create 2020-02-02 15:57
 * @description：
 */
@Component
public class HcBeanPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        // 强制转换为一般的 BeanDefinition
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("example");

        // 修改 bean 的 beanClass，该方法在 GenericBeanDefinition 中
        beanDefinition.setBeanClass(Example.class);
    }
}
