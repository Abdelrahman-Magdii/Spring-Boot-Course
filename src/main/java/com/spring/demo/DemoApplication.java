package com.spring.demo;

import com.spring.demo.Services.UserServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	private static UserServices userServices = null;

    public DemoApplication(UserServices userServices) {
        this.userServices = userServices;
    }
	

    public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println(" num of Beans " + context.getBeanDefinitionCount());

		userServices.showMessage();
	}

}
