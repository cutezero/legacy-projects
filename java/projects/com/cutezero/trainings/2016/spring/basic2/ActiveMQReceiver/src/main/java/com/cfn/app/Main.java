package com.cfn.app;

import javax.jms.JMSException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws JMSException {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		JmsMessageReceiver jms=(JmsMessageReceiver)ctx.getBean("jmsMessageReceiver");
		jms.receive();
	}

}
