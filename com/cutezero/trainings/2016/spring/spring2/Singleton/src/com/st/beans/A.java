package com.st.beans;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class A {

	private static A instance;
	private A(){
		//Do not remove this
		System.out.println("constructor A called");
	}
	public synchronized static A getInstance() throws InterruptedException{
		if (instance==null){
			Thread.sleep(1000L);
			
			instance=new A();
		}
		return instance;
	}
}
