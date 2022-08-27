import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack.sl.TestBean;

public class Main {

	public static void main(String[] args) 
	{
		//ApplicationContext ctx=new AnnotationConfigApplicationContext("pack.config.AppConfig.class");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean testBean=(TestBean)ctx.getBean("testBean");
		testBean.m1();
		System.out.println("========");
		testBean.m2();
		System.out.println("========");
		testBean.m3();
	}

}
