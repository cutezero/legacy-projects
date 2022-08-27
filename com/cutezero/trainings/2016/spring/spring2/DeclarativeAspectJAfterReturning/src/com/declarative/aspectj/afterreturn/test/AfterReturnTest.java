package com.declarative.aspectj.afterreturn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.declarative.aspectj.afterreturn.beans.KeyGenerator;

public class AfterReturnTest {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/declarative/aspectj/afterreturn/common/application-context.xml");
		KeyGenerator generator=context.getBean("keyGenerator", KeyGenerator.class);
		int result=generator.generateKey(7);
		System.out.println(" Result : "+result);
		
	}

}
