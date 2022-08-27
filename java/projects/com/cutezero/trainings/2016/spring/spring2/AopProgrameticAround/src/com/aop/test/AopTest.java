package com.aop.test;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.aop.aspects.LoggingAdvice;
import com.aop.aspects.CacheAdvice;
import com.aop.aspects.ExecTimeAdvice;
import com.aop.aspects.JamonAdvice;
import com.aop.beans.Calculator;
import com.aop.pointcuts.DynamicLoggingPointcut;
import com.aop.pointcuts.LoggingStaticPointcut;

public class AopTest {

	public static void main(String[] args) {

		int result=0;
		//Standard way without logging 
		//Calculator calculator= new Calculator();	//#1
		
		//Using bean factory
/*		BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("com/aop/common/application-context.xml"));
		Calculator calculator=beanFactory.getBean("proxy", Calculator.class);
*/		
		
		ProxyFactory proxyFactory= new ProxyFactory();	//#3
		proxyFactory.setTarget(new Calculator());
		
		/**
		 * The purpose of the cross-cutting-logic will tell us which one should execute first
		 * We always should take each cross-cutting logic per class so that we can easily turn on/off and maintain
		 * 
		 * 
		 */
//		proxyFactory.addAdvice(new CacheAdvice());		
//		proxyFactory.addAdvice(new LoggingAdvice());
//		proxyFactory.addAdvice(new ExecTimeAdvice());
//		proxyFactory.addAdvice(new JamonAdvice());
		
//		Advisor advisor= new DefaultPointcutAdvisor(new LoggingPointcut(), new LoggingAdvice());
//		proxyFactory.addAdvisor(advisor);
		proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new DynamicLoggingPointcut(), new LoggingAdvice()));
		
		Calculator calculator= (Calculator) proxyFactory.getProxy();
		
		result=calculator.add(20, 45);
		System.out.println("Result Add: "+result);
		result=calculator.add(200, 450);
		System.out.println("Result Add: "+result);
		result=calculator.substract(20, 45);
		System.out.println("Result Substract: "+result);
		result=calculator.multiply(20, 45);
		System.out.println("Result Multiply: "+result);
		result=calculator.multiply(209898, 47899895);
		System.out.println("Result Multiply: "+result);
		result=calculator.divide(20, 45);
		System.out.println("Result divide: "+result);
		result=calculator.add(200, 450, 90);
		System.out.println("Result Add: "+result);
		result=calculator.add(20, 45, 94350969);
		System.out.println("Result Add: "+result);
		System.out.println("-----Completed----- ");
		
	}

}
