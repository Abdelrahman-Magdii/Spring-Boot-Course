package com.spring.demo.Services;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class UserServices {


    public void showMessage(){
        System.out.println("my Bean.............");
    }

}
