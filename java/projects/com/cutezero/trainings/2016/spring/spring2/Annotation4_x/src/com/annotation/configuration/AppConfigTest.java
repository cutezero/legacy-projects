package com.annotation.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppConfigTest {

	public static void main(String[] args) {
		System.out.println("-------------Program Starts here--------");
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Context object created");
//		Robot robot=context.getBean("robot", Robot.class);
		
		Robot robot=context.getBean("robot", Robot.class);
		System.out.println(robot);
		
		
		/*Robot robot2=context.getBean("robot1", Robot.class);
		Robot robot3=context.getBean("robot1", Robot.class);
		System.out.println(robot);
		System.out.println("Prototype ? "+ (robot2==robot3));
		System.out.println("-------------Program ends here--------");
*/	}
}
