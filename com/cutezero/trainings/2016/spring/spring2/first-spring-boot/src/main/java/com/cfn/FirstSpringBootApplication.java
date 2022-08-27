package com.cfn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.cfn.beans.Robot;

@SpringBootApplication(scanBasePackages="com.cfn.beans")
@PropertySource("appValue.properties")
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(FirstSpringBootApplication.class, args);
		System.out.println(context.getBean("robot", Robot.class).walk());
	}
}
