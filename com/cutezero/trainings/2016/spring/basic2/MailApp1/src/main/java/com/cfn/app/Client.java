package com.cfn.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
		MailSendBean bean= (MailSendBean) ctx.getBean("mailSendBean");
		bean.sendMail();
		System.out.println("Client invokation completed");
	}

}
