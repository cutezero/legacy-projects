package com.aw.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware{
	private IEngine engine;
	private BeanFactory beanFactory;
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		this.beanFactory=arg0;
	}

	public void drive(){
		engine=beanFactory.getBean("hondaEngine", IEngine.class);
		engine.start();
		System.out.println("Driving");
	}
}
