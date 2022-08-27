package com.ib.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ib.beans.Bicycle;

public class IBTest {

	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/ib/common/application-context.xml"));
		Bicycle bicycle=factory.getBean("bicycle", Bicycle.class);
		System.out.println(bicycle);
		Bicycle bicycle2=factory.getBean("bicycle2", Bicycle.class);
		System.out.println(bicycle2);
		Bicycle bicycle3=factory.getBean("bicycle3", Bicycle.class);
		System.out.println(bicycle3);
	}
}
