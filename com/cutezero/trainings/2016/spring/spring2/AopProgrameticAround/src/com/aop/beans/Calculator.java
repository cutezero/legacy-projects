package com.aop.beans;

public class Calculator {

	public int add(int a, int b){
		System.out.println(" inside add(a,b)");
		return a+b;
	}
	public int substract(int a, int b){
		System.out.println(" inside Substract(a,b)");
		return a-b;
	}
	public int multiply(int a, int b){
		System.out.println(" inside Multiply(a,b)");
		return a*b*a*b*a*b*a*a*b;
	}
	public int divide(int a, int b){
		System.out.println(" inside divide(a,b)");
		return a/b;
	}
	public int add(int a, int b, int c){
		System.out.println(" inside add(a,b,c)");
		return a+b+c;
	}
}
