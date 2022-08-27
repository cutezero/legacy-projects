package com.ai.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ai.beans.Radio;

public class AITest {

	/**
	 * If we want to use a bean inside our class which is already defined in the same IOC container
	 * then we shall go for BeanFactoryAware Interface to avoid creating multiple istance of the same IOC
	 * And it always gives us the reference of the same IOC where both the bean reference are placed
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/ai/commons/application-context.xml"));
		Radio radio=beanFactory.getBean("radio",Radio.class);
		String s=radio.play(198.3f);
		System.out.println(s);
	}

}
