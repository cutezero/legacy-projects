package com.cfn.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Product p=(Product)ctx.getBean("productImpl");
		System.out.println("======================");
		p.add(10, 30);
		System.out.println("======================");
		p.multiply(23, 100);
	}

}
