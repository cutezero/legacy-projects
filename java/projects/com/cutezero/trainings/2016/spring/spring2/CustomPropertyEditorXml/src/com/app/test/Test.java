package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Customer;

public class Test {

	/**
	 * Tried this program by copying from the internet, But its not working
	 * However I think The approach is to reduce the xml configuration 
	 * But, if we take the XML procedure to approach the requirement it makes no sense
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/app/common/application-context.xml");
		Customer customer=context.getBean("customer", Customer.class);
		System.out.println(customer);
	}

}
