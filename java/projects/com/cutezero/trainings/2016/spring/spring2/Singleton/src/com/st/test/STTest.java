package com.st.test;

import com.st.beans.B;
import com.st.beans.C;
import com.st.beans.Worker;

public class STTest {

	public static void main(String[] args) throws InterruptedException {
		B b= new B();
		b.display();
		new C().doSomething();
		System.out.println("========================");
		
		Worker worker= new Worker();
		worker.run();
		System.out.println("========================");
		
		Thread t1= new Thread(worker);
		Thread t2= new Thread(worker);
		
		System.out.println("========================");
		t1.start(); //Thread will go to ready state and handoverd to Thread scheduler
		t2.start();
		System.out.println("========================");
		
	}
}
