package com.cfn;

public class ObserverTest {

	public static void main(String[] args) {
		Subject1 s= new SubjectImpl();
		Observer1 o1= new ObserverImpl();
		Observer1 o2= new ObserverImpl();
		Observer1 o3= new ObserverImpl();
		Observer1 o4= new ObserverImpl();
		s.addObserver(o1);
		s.addObserver(o2);
		s.addObserver(o3);
		s.addObserver(o4);
		
		System.out.println("default values are: ");
		
		s.print();
		o1.print();
		o2.print();
		o3.print();
		o4.print();
		System.out.println("========================");
		s.setState("Welcome");
		s.print();
		o1.print();
		o2.print();
		o3.print();
		o4.print();
		System.out.println("========================");
		
		s.removeObserver(o3);
		s.setState("Bye");
		s.print();
		o1.print();
		o2.print();
		o3.print();
		o4.print();
	}

}
