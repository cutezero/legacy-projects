package com.cdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cdi.beans.Meeting;

public class CDI2Test {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/cdi/common/application-context.xml"));
		Meeting meeting =factory.getBean("meeting", Meeting.class);
		System.out.println(meeting);
	}
	
}
