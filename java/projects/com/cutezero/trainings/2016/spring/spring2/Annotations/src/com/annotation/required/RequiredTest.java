package com.annotation.required;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class RequiredTest {

	public static void main(String[] args) {

		/**
		 * Well BeanFactory just doesn't work and may need some extra process to be supported to annotation
		 */
/*		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/annotation/required/required-context.xml"));
		Rocket rocket= factory.getBean("rocket", Rocket.class);
		System.out.println(rocket);
*/	

		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/required/required-context.xml");
		Rocket rocket=context.getBean("rocket", Rocket.class);
		System.out.println(rocket);
		
		
		
		
	}
}
