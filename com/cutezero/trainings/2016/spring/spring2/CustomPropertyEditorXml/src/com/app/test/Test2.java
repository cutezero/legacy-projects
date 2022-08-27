package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app2.beans.MyBean;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/app/common/application-context2.xml");
		MyBean bean = context.getBean(MyBean.class);
		System.out.println(bean);
	}

}
