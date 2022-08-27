package com.annotation.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeTest {

	public static void main(String[] args) {
		
		System.out.println("----------------");
		test1();
		System.out.println("----------------");
		test2();
		System.out.println("----------------");
	}
	
	public static void test2(){
		ApplicationContext context= new AnnotationConfigApplicationContext("com.annotation.stereotype");
		Bicycle bicycle=context.getBean("hero", Bicycle.class);
		System.out.println(bicycle);
	}
	
	
	
	public static void test1(){
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/annotation/stereotype/stereotype-context.xml");
//		Bicycle bicycle=context.getBean("bicycle", Bicycle.class);	//default id value
		Bicycle bicycle=context.getBean("hero", Bicycle.class);	//custom id value
		bicycle.ride();
		System.out.println(bicycle);
		Bicycle bicycle1=context.getBean("hero", Bicycle.class);	//custom id value
		bicycle1.ride();
//		System.out.println(bicycle);
		Bicycle bicycle2=context.getBean("hero", Bicycle.class);	//custom id value
		bicycle2.ride();
		System.out.println("is both bicycle same : "+ (bicycle1==bicycle2 ? true : false));
		
	}

}
