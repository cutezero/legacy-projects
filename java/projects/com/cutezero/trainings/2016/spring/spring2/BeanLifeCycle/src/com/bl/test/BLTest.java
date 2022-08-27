package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.Rocket;
import com.bl.beans.ShutdownHook;

public class BLTest {

	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/bl/commons/application-context.xml"));
		/** Get the shutdownHook object from IOC and hook it to Runtime(JVM) object
		 * so that the shutdownHook
		 */
		ShutdownHook shutdownHook=beanFactory.getBean("shutdownHook", ShutdownHook.class);
		Runtime runtime=Runtime.getRuntime();
		runtime.addShutdownHook(new Thread(shutdownHook));
		
		Rocket rocket=beanFactory.getBean("rocket", Rocket.class);
		System.out.println(rocket);
		System.out.println("End of ---Main()");
		
		
		/**
		 * This can be written to inform the IOC that JVM is terminating 
		 * and IOC should preform the destroy logic
		 * howerver the below lines of code will inform the IOC before it gets removed from JVM Memory .
		 */
/*		((ConfigurableListableBeanFactory) beanFactory).destroySingletons();
		rocket=beanFactory.getBean("rocket", Rocket.class);
*/
	}

}
