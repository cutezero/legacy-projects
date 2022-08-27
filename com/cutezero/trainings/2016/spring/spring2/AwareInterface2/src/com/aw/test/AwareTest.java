package com.aw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.aw.beans.Car;

public class AwareTest {

	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/aw/commons/application-context.xml"));
		Car car=beanFactory.getBean("car", Car.class);
		car.drive();
		
	}

}
