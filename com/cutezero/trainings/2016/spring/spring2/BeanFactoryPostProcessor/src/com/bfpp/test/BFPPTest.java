package com.bfpp.test;

import java.sql.Connection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bfpp.dao.ConnectionFactory;

public class BFPPTest {

	public static void main(String[] args) {

		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/bfpp/common/application-context.xml"));
		BeanFactoryPostProcessor beanFactoryPostProcessor=beanFactory.getBean("propertyPlaceholderConfigurer", BeanFactoryPostProcessor.class); 
		beanFactoryPostProcessor.postProcessBeanFactory((ConfigurableListableBeanFactory)beanFactory);
 		ConnectionFactory connectionFactory=beanFactory.getBean("connectionFactory", ConnectionFactory.class);
		Connection con=connectionFactory.getConnection();
		System.out.println(con);
		System.out.println(connectionFactory);
		System.out.println("Completed");
	}
}
