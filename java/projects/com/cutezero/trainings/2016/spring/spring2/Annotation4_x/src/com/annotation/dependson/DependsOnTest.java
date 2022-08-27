
package com.annotation.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext("com.annotation.dependson");
//		context.getBean("cacheManager",CacheManager.class);
		LoanCalculator calculator= context.getBean("loanCalculator",LoanCalculator.class);
		Double amount=calculator.calculate(1200, 2, "BBS", 2);
		System.out.println(amount);
		
	}

}
