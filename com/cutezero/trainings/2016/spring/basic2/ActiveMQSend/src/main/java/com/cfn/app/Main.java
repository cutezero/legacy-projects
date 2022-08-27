package com.cfn.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		JmsMessageSender jms=(JmsMessageSender)ctx.getBean("jmsMessageSender");
		jms.send("I am from Jms Sender ");
		System.out.println("Message sent");
		
	}

}
