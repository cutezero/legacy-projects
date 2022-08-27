package com.pack;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MyBean mb=(MyBean)ctx.getBean("myBean");
		mb.sayHello();
		ctx.close();
	}

}
