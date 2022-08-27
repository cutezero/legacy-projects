package com.dp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

abstract public class Car {

	/**
	 * #1. For the first step we we shall try as a dependency injection
	 * If we inject by dependency injection then the bean(Engine) will 
	 * act as a Singleton bean in this bean
	 * However, it just doesn't work as per our requirement
	 */
	/*private IEngine engine;	//#1
	
	public void setEngine(IEngine engine) {	//#1
		this.engine = engine;
	}*/

	/**
	 * #2. We can go for pulling, but for that we need to create the 
	 * object of the dependency wherever we need in the class just like 
	 * create, use, discard the object like following
	 * However it works as per our Requirement ( Not Recommended at all)
	 */
/*	private BeanFactory factory;	//#2
	//implements BeanFactoryAware	//#2
	@Override	//#2
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		this.factory=factory;
	}
*/
	public void drive(){
		
/*		IEngine engine=null;	//#2
		//engine= new YamahaEngine();	//it will be completely tightly coupled by referring the the concrete class name
		engine= factory.getBean("yamahaEngine", IEngine.class);	//#2
*/
		/**
		 * #3. Write a method which returns object of IEngine type and Tell IOC to 
		 * override that method as lookup method to inject at runtime 
		 * Well it does works perfectly as per our requirement
		 * (IOC uses internally proxy design pattern to extend and override the required methods 
		 * using cgLib and ASM Libraries for runtime byte code generation )
		 * #4. But it is recommended to make the "getIEngine()" as abstract to avoid 
		 * confusion because returning null looks like the method is wrongly placed inside the code for 
		 * any new guy who sees it. And of course make the class as abstract 
		 * 
		 * This is the only case where a class can be "abstract class" to be instantiated by Spring 
		 */
		IEngine engine=null;	//#3
		engine=getIEngine();	//#3
		engine.start();
		System.out.println("driving car using Engine : "+engine.getClass().getName());
		System.out.println("Hash code from Car's drive(): "+this.hashCode());
	}
	
/*	public IEngine getIEngine(){	//#3
		return null;
	}*/

	abstract public IEngine getIEngine();	//#4
}
