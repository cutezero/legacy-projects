package com.don.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.don.beans.LoanFinder;

public class DONTest {

	public static void main(String[] args) throws Exception {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/don/common/application-context.xml"));
		LoanFinder loanFinder= factory.getBean("loanFinder", LoanFinder.class);
		double amount=loanFinder.calculateLoan(210000, 2, "Hyd");
		System.out.println("Total Amount : "+amount);
		String city= loanFinder.getCity();
		System.out.println("City : "+city);
		
		System.out.println("Program completed");
	}

}
