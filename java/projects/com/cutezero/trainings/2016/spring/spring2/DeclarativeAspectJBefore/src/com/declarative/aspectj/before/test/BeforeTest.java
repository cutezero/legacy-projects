package com.declarative.aspectj.before.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.declarative.aspectj.before.beans.LoanManager;
import com.declarative.aspectj.before.helper.AuthenticationHelper;

public class BeforeTest {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/declarative/aspectj/before/common/application-context.xml");
		LoanManager loanManager= context.getBean("loanManager", LoanManager.class);
		
		AuthenticationHelper helper= context.getBean("authenticationHelper", AuthenticationHelper.class);
//		helper.login("john", "welcome");	//wrong password
//		helper.login("john", "welcome1");	//correct data
		helper.login(null, null);	//correct data
		
		boolean status=loanManager.approveLoan("490490");
		System.out.println(" Status : "+status);
		status=loanManager.approveLoan("490479");
		System.out.println(" Status : "+status);
		status=loanManager.approveLoan("490490");
		System.out.println(" Status : "+status);
		System.out.println(" DONE ");
		
		
	}

}
