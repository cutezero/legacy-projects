package com.pdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pdi.beans.Account;

public class PDITest {

	public static void main(String[] args) {
		try {
			System.out.println("------Demo of circular dependency problem(Don't tense for the error)--------------");
			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pdi/common/application-context.xml"));
			Account account = factory.getBean("account", Account.class);
			System.out.println(account);
		} finally {
			System.out.println("Well program has circular dependency problem");
		}
	}

}
