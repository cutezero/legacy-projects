package com.annotation.propertysource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PSTest {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext("com/annotation/propertysource");
		Toy toy=context.getBean("toy", Toy.class);
		System.out.println(toy);
	}
}
