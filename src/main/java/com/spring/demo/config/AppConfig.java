package com.spring.demo.config;

import com.spring.demo.Services.UserServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring")
public class AppConfig {

    @Bean
    public UserServices userServices(){
        return new UserServices();
    }

//    @Bean(initMethod = "customInit" ,destroyMethod = "customDestroy")
//    public MyServiuces MyServices(){
//        return new MyServiuces();
//    }


//    @Bean(destroyMethod = "customDestroy")
//    public MyServiuces MyServicesDestroy(){
//        return new MyServiuces();
//    }
}
