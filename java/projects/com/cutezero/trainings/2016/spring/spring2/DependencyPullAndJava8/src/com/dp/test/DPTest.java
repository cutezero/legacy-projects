package com.dp.test;

import java.beans.XMLDecoder;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dp.beans.Car;

public class DPTest {

	//LookupMethodInjection Project on same IDE
	public static void main(String...args) throws InterruptedException {

		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/dp/common/application-context.xml"));
		Car car=factory.getBean("car", Car.class);
		Thread t1=new Thread(()->{
			car.drive();
		});
		Runnable t2= () ->{		//lambda expression
			car.drive();

		};

		System.out.println("Threads T1 and T2");
		t1.start();
		System.out.println("Threads T1 completed ");
		new Thread(t2).start();
		System.out.println("Threads T2 completed ");
		System.out.println("Implementation Class name : "+car.getClass().getName());
		Car car2=factory.getBean("car", Car.class);
		Thread t3=new Thread(() -> {
			car2.drive();
		});
		System.out.println("Is Alive() T1: "+t1.isAlive());
		System.out.println("Is Alive() T3: "+t3.isAlive());
		t1.join();
		t3.join();
		System.out.println("Is Alive() T1: "+t1.isAlive());
		System.out.println("Is Alive() T3: "+t3.isAlive());
		System.out.println("I mplementation Class name : "+car.getClass().getName());
		System.out.println("Completed");
	}
}

