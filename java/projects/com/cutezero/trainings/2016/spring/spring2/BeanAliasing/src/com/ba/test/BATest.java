package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Address;
import com.ba.beans.Order;
import com.ba.beans.TransportManager;

public class BATest {

	public static void main(String[] args) {
		
		BeanFactory parentFactory= new XmlBeanFactory(new ClassPathResource("com/ba/common/parent-context.xml"));
		Order order=parentFactory.getBean("order", Order.class);
		Address address=parentFactory.getBean("address", Address.class);
		BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
		TransportManager transportManager=beanFactory.getBean("transportManager", TransportManager.class);
		String msg= transportManager.transport(order, address);
		System.out.println(msg);
		String[] aliasNames= beanFactory.getAliases("d");
		for (String alias: aliasNames){
			System.out.println(alias);
		}
	}

}
