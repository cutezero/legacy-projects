package com.annotation.version4.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookupTest {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext("com.annotation.version4.lookup");
		Container container=context.getBean("container", Container.class);
		container.processRequest("Data1");
		container.processRequest("Data2");
		container.processRequest("Data3");
		container.processRequest("Data4");
		System.out.println("Well I think its working ");
	}
}
