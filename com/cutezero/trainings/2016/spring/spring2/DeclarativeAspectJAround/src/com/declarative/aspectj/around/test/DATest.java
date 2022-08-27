package com.declarative.aspectj.around.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.declarative.aspectj.around.beans.Calculator;

public class DATest {

	public static void main(String[] args) {
		//beanFactory doesn't work at all in the following way
/*		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/declarative/aspectj/around/common/application-context.xml"));
		Calculator calculator=factory.getBean("calculator", Calculator.class);
*/		
		
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/declarative/aspectj/around/common/application-context.xml");
		Calculator calculator=context.getBean("calculator", Calculator.class);
//		Calculator calculator=context.getBean("calculator1", Calculator.class); 	//for bean type PCD in application context
		
		int sum=calculator.add(100, 224);
		System.out.println("Sum : "+ sum);
		System.out.println(" Completed ");
		
		sum=calculator.add(100, 224);
		System.out.println("Sum : "+ sum);
		System.out.println(" Completed ");
		
		sum=calculator.add(100, 224);
		System.out.println("Sum : "+ sum);
		System.out.println(" Completed ");
		
//		((AbstractApplicationContext)context).registerShutdownHook();
	}

}
