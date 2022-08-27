package com.cfn.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AccountInter inter=(AccountInter)ctx.getBean("accountImpl");
		
		try {
			inter.transferMoney(101, 102, 2000);
		} catch (Exception e) {
			System.out.println("Transaction failed");
			e.printStackTrace();
		}
	}
}
