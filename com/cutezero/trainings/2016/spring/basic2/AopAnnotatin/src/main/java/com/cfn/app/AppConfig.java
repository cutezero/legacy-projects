package com.cfn.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.cfn.app")
public class AppConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
			Demo d=(Demo)ctx.getBean("demoImpl");
			d.m1(890);
			d.m2();
			d.m1(-789);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("whoa");
	}

}
