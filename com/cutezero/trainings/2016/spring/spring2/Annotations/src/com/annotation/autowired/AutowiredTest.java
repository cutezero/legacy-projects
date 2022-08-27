package com.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/annotation/autowired/autowired-context.xml");
		Robot robot= context.getBean("robot", Robot.class);
		System.out.println(robot);
	}

}
