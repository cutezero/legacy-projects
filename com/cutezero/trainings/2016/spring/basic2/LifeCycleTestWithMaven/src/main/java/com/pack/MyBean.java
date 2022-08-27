package com.pack;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBean implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
	
	private String message;
	
	public void setMessage(String message){
		this.message=message;
		System.out.println("My dear Lucky, where are you");
	}
	
	public void sayHello(){
		System.out.println("Baby where are you this is a service method called from client may be");
	}
	
	
	public void destroy() throws Exception {
		System.out.println("DisposalBean's destroy () is called ");

	}

	
	public void afterPropertiesSet() throws Exception {
		System.out.println("IntializingBean's afterPropertiesSet() is called ");

	}

	
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("ApplicationContext's setApplicationContext() is called ");

	}

	
	public void setBeanName(String arg0) {
		System.out.println("BeanNameAware's setBeanName() is called ");

	}
	
	public void setUp(){
		System.out.println("Customized init() is called ");
	}
	
	public void tearDown(){
		System.out.println("Customized destroy() is called ");
	}

}
