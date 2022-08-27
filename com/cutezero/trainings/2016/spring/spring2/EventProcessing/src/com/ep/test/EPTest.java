package com.ep.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.beans.Source;

public class EPTest {

	public static void main(String[] args) {
		//BeanFactory doesn't Support EventProcessing
		ApplicationContext context= new ClassPathXmlApplicationContext("com/ep/common/application-context.xml");
		Source source=context.getBean("source", Source.class);
		source.updateCity(12, "DELHI");
		System.out.println(" Completed ");
	}

}
