package com.declarative.aspectj.around.beans;

public class Calculator {

	public int add( int a, int b){
		System.out.println(" in add ()");
		return a+b;
	}
}
