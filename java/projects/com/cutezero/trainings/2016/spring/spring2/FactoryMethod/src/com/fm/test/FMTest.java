package com.fm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fm.beans.MessageProducer;
import com.fm.beans.SingletonValidator;

public class FMTest {

	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/fm/common/application-context.xml"));
		MessageProducer messageProducer=factory.getBean("messageProducer", MessageProducer.class);
		MessageProducer messageProducer2=factory.getBean("messageProducer", MessageProducer.class);
		SingletonValidator validator=factory.getBean("singletonValidator", SingletonValidator.class);
		SingletonValidator validator2=factory.getBean("singletonValidator", SingletonValidator.class);
		System.out.println(messageProducer==messageProducer2);
		System.out.println(messageProducer.getMessage());
		System.out.println(validator==validator2);
		System.out.println(validator==validator2);
		System.out.println(validator.validate());
		SingletonValidator validator3=SingletonValidator.getInstance();
		System.out.println(validator==validator3);
		
		//play with StackTrace Class get the methods and elemnets of StackTrace
		
	}

}
