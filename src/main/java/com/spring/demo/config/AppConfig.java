package com.spring.demo.config;

import com.spring.demo.Services.MyServiuces;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean(initMethod = "customInit")
    public MyServiuces MyServices(){
        return new MyServiuces();
    }


    @Bean(destroyMethod = "customDestroy")
    public MyServiuces MyServicesDestroy(){
        return new MyServiuces();
    }
}
