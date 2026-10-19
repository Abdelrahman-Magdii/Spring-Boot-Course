package com.spring.demo;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyProcessor implements BeanPostProcessor {


//    @Override
//    public @Nullable Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//
//        System.out.println("Before" + beanName);
//
//        return bean;
//    }
//
//    @Override
//    public @Nullable Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//
//        System.out.println("After" + beanName);
//
//        return bean;
//    }
}
