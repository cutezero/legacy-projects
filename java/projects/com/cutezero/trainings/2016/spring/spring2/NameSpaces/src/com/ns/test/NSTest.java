package com.ns.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ns.beans.Toy;

public class NSTest {

	/**
	 * This particulaar program demonstrates about the use of 
	 * "p namespace" for property(setter injection) and "c namespace" for constructor injection
	 * a simple program
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/ns/common/application-context.xml"));
		Toy toy=factory.getBean("toy", Toy.class);
		System.out.println(toy);
	}

}
