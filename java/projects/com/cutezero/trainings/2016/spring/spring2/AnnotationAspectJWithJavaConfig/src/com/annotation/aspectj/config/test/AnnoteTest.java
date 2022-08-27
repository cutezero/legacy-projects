package com.annotation.aspectj.config.test;

import java.nio.file.AccessDeniedException;

import org.aspectj.ajdt.internal.compiler.lookup.HelperInterfaceBinding;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotation.aspectj.config.beans.Calculator;
import com.annotation.aspectj.config.beans.KeyGenerator;
import com.annotation.aspectj.config.beans.LoanManager;
import com.annotation.aspectj.config.beans.Thrower;
import com.annotation.aspectj.config.helper.AuthenticationHelper;
import com.annotation.aspectj.config.javaconfig.AppConfig;

public class AnnoteTest {

	public static void main(String[] args) throws AccessDeniedException {

		@SuppressWarnings("resource")
//		ApplicationContext context= new AnnotationConfigApplicationContext("com.annotation.aspectj.xml.beans", "com.annotation.aspectj.xml.aspects", "com.annotation.aspectj.xml.common", "com.annotation.aspectj.xml.common");
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Around aspect advice
/*		Calculator calculator=context.getBean("calculator", Calculator.class);
		int sum=calculator.add(234, 6465);
		System.out.println("Sum : "+sum);
		sum=calculator.add(79834, 6465);
		System.out.println("Sum : "+sum);
		sum=calculator.add(234, 6465);
		System.out.println("Sum : "+sum);
		sum=calculator.add(234, 6465);
		System.out.println("Sum : "+sum);
*/		
		
		//Before aspect advice
/*		LoanManager loanManager= context.getBean("loanManager", LoanManager.class);
		AuthenticationHelper helper= context.getBean("authenticationHelper", AuthenticationHelper.class);
//		helper.login("john", "welcome1");	//correct data
		helper.login("john", "welcome2");	//wrong data
		boolean status= loanManager.approveLoan("8970");
		System.out.println("Status : "+status);
		*/
		
		//After Returning aspect advice
/*		KeyGenerator generator= context.getBean("keyGenerator", KeyGenerator.class);
		int result=generator.generateKey(9);
		System.out.println(" Result : "+result);
		result=generator.generateKey(8);
		System.out.println(" Result : "+result);
*/
		
		//After throwing 
		Thrower thrower= context.getBean("thrower", Thrower.class);
		int throwingResult=thrower.isThrowing(8);
		System.out.println("Throwing Result : "+throwingResult);
		throwingResult=thrower.isThrowing(0);
		System.out.println("Throwing Result : "+throwingResult);
	
		throwingResult=thrower.isThrowing(1);
		System.out.println("Throwing Result : "+throwingResult);
		
		throwingResult=thrower.isThrowing(2);
		System.out.println("Throwing Result : "+throwingResult);
		
		throwingResult=thrower.isThrowing(3);
		System.out.println("Throwing Result : "+throwingResult);
		
		throwingResult=thrower.isThrowing(4);
		System.out.println("Throwing Result : "+throwingResult);
		
		throwingResult=thrower.isThrowing(5);
		System.out.println("Throwing Result : "+throwingResult);
		
		throwingResult=thrower.isThrowing(6);
		System.out.println("Throwing Result : "+throwingResult);
		
	}

}
