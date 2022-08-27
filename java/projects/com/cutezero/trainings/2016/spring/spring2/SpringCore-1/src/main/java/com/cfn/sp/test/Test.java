package com.cfn.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cfn.sp.beans.MessageWriter;

public class Test {

	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/cfn/sp/common/application-context.xml"));
		MessageWriter messageWriter= (MessageWriter) factory.getBean("messageWriter");
		messageWriter.writeMessage("Oh this is fucking spring framework");
	}
}
