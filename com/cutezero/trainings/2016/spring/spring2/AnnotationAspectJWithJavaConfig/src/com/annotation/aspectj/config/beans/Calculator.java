package com.annotation.aspectj.config.beans;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public int add(int a, int b){
		System.out.println("in Add()");
		return a+b;
	}
}
