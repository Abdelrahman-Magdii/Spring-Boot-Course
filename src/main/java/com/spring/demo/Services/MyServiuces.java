//package com.spring.demo.Services;
//
//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.stereotype.Component;
//
////@Component
//public class MyServiuces implements InitializingBean  , DisposableBean {
//
//
//    @PostConstruct
//    public void postConstruct(){
//        System.out.println("post construct");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("after bean init");
//    }
//
//    public void customInit(){
//        System.out.println("custom init");
//    }
//
//    @PreDestroy
//    public void preDestroy(){
//        // exe logic before app destroy
//        System.out.println("pre Destroy");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        // exe logic before app destroy
//        System.out.println("destroy");
//    }
//
//    public void customDestroy(){
//        System.out.println("custom Destroy");
//    }
//
//
//}
