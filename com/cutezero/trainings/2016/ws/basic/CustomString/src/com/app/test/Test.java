package com.app.test;


public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String string= new String();
		System.out.println("String object created");
		System.out.println("Class Loader name :"+String.class.getClassLoader());
		System.out.println("Class full name :"+String.class.getCanonicalName());
		System.out.println("------------------------------------------------");
		System.out.println("===============");

		System.out.println("======================");
		
		Class name=Class.forName("DefaultClass2");
		System.out.println(name.getCanonicalName());
		
		Class name2=Class.forName("DefaultClassForTest");
		System.out.println(name2.getCanonicalName());
		
		
		
		
		
	}

}
