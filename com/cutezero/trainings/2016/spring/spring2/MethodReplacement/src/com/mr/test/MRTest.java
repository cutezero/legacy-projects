package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.PlanFinder;

public class MRTest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/mr/common/application-context.xml"));
		PlanFinder planFinder=factory.getBean("planFinder", PlanFinder.class);
		String[] plans=planFinder.findPlan(24, 761011, "female", 1, 2, 20);
		System.out.println("Processing your plans ");
		System.out.println("Recommended Plans are : ");
		for(String plan : plans){
			System.out.println(plan);
		}
	}

}
