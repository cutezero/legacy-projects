package com.map.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.map.beans.CustomMapEngine;

public class MapEngineTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/map/commons/application-context.xml"));
		CustomMapEngine engine=factory.getBean("customMapEngine", CustomMapEngine.class);
		engine.render("Hyd", "BAM");
		System.out.println("DONE");
	}

}
