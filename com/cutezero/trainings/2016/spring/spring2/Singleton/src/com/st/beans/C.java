package com.st.beans;

public class C {

	public void doSomething() throws InterruptedException{
		A a1=A.getInstance();
		System.out.println("A called by C");
	}
}
