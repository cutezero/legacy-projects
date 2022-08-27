package com.ac.test;

import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
 
import com.ac.beans.Robot;

public class ACTest {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ac/common/application-context.xml"));
		Robot robot=factory.getBean("robot", Robot.class);
		System.out.println(robot);

	}
}

