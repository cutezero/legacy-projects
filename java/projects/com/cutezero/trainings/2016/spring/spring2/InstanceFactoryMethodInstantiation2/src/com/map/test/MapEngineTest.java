package com.map.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.map.beans.CustomMapEngine;

public class MapEngineTest {

	/**
	 * We have a requirement that to Make our own MapEngine for 2 countries(US, India)
	 * Here sometime we need USMapEngine and sometime IndiaMapEngine according 
	 * to the runtime request coming from user to know the direction 
	 * However we may call Google map APi for this functionality in real case scenario
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/map/commons/application-context.xml"));
		CustomMapEngine engine=factory.getBean("customMapEngine", CustomMapEngine.class);
		engine.render("Hyd", "BAM");
		System.out.println("DONE");
	}

}
