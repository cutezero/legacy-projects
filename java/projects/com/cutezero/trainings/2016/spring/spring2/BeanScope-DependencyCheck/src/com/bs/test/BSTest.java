package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.beans.Toy;

public class BSTest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/bs/common/application-context.xml"));
		Toy toy1= (Toy) factory.getBean("toy");
		System.out.println(toy1);
		Toy toy2= (Toy) factory.getBean("toy");
		System.out.println(toy2);
		
		System.out.println("Is both toy1 and toy2 are same ? Ans :" +(toy1==toy2 ? true:false));
	}

}
