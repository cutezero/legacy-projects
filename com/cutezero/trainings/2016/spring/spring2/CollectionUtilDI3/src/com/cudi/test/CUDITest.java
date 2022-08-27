package com.cudi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cudi.beans.Course;
import com.cudi.beans.University;

public class CUDITest {

	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/cudi/common/util-application-context.xml"));
		
		/*Course course = factory.getBean("course", Course.class);
		System.out.println(course);*/
		
		University university= factory.getBean("university", University.class);
		System.out.println(university);
	}

}
