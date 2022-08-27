package com.pdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pdi.beans.Meeting;

public class PDITest {

	public static void main(String[] args) {

		/**
		 * As a Collection also an Object type so we can configure it as a bean 
		 * in the Spring bean configuration. But it will result that a empty Collection object 
		 * always injected to the dependent class
		 * Here we are demonstrating what happens if we configurea Collection as a bean in 
		 * spring bean configuration
		 * 
		 */
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pdi/common/application-context.xml"));
		Meeting meeting = factory.getBean("meeting", Meeting.class);
		System.out.println(meeting);
	}

}
