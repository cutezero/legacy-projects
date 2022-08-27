package com.annotation.aspectj.xml.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.aspectj.xml.beans.Calculator;

public class AnnoteTest {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/annotation/aspectj/xml/common/application-context.xml");
//		ApplicationContext context= new AnnotationConfigApplicationContext("com.annotation.aspectj.xml.beans", "com.annotation.aspectj.xml.aspects", "com.annotation.aspectj.xml.common", "com.annotation.aspectj.xml.common");
		Calculator calculator=context.getBean("calculator", Calculator.class);
		int sum=calculator.add(234, 6465);
		System.out.println("Sum : "+sum);
		sum=calculator.add(234, 6465);
		System.out.println("Sum : "+sum);
		sum=calculator.add(234, 6465);
		System.out.println("Sum : "+sum);
		sum=calculator.add(24, 6465);
		System.out.println("Sum : "+sum);
		sum=calculator.add(234, 6465);
		System.out.println("Sum : "+sum);
	}
}
