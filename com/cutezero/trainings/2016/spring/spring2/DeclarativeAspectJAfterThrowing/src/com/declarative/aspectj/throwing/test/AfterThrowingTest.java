package com.declarative.aspectj.throwing.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.declarative.aspectj.throwing.beans.Thrower;

public class AfterThrowingTest {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/declarative/aspectj/throwing/common/application-context.xml");
		Thrower thrower=context.getBean("thrower", Thrower.class);
		int result= thrower.iAmThrowing(-24);
		System.out.println("Result : "+result);
	}

}
