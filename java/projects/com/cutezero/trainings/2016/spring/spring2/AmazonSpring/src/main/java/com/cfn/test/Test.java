package com.cfn.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cfn.beans.AmazonTransportManager;
import com.cfn.model.Address;

public class Test {

	public static void main(String[] args) {
		
	@SuppressWarnings("deprecation")
	BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/cfn/common/application-context.xml"));
	AmazonTransportManager amazonTransportManager= (AmazonTransportManager) factory.getBean("amazonTransportManager");
	List<String> list= new ArrayList<String>();
	Address address = new Address();
	
	String trackId= amazonTransportManager.transport(list, address);
	System.out.println(trackId);
	}
}
