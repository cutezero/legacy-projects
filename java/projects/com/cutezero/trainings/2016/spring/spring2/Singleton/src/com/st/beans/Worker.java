package com.st.beans;

public class Worker implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		A a;
		try {
			a = A.getInstance();
			System.out.println("Hash code : :"+a.hashCode());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Different object will be returned in this method");
		Thread t1=new Thread(new Worker());
		Thread t2=new Thread(new Worker());
		t1.start();
		t2.start();
		System.out.println("===============");
	}
}
