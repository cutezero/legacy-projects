package com.annote.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annote.beans.Manufacturer;

public class NonInvasiveAnnoteTest {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/annote/common/applicationContext.xml");
		Manufacturer manufacturer= context.getBean("manufacturer", Manufacturer.class);
		System.out.println(manufacturer);
		System.out.println(" DONE ");
		
		((AbstractApplicationContext)context).registerShutdownHook();
	}

}
