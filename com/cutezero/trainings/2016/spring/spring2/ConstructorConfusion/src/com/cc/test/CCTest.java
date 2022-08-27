package com.cc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cc.beans.Person;

public class CCTest {

	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/cc/common/application-context.xml"));
		Person person=factory.getBean("person", Person.class);
		System.out.println(person);
		
	}
}
