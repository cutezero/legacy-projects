package com.cfn.app;

import org.aspectj.lang.JoinPoint;

public class MyAdvices {

	public void before(JoinPoint jp){
		String methodName=jp.getSignature().getName();
		Object args[]=jp.getArgs();
		System.out.println("I am advice before execution :"+methodName);
		System.out.println("Args of this methods:"+args[0]+", "+args[1]);
	}
	
	public void afterReturning(JoinPoint jp, Object result){
		String methodName=jp.getSignature().getName();
		Object args[]=jp.getArgs();
		System.out.println("I am advice before execution :"+methodName);
		System.out.println("Args of this methods:"+args[0]+", "+args[1]);
		System.out.println("Result of this methods:"+result);
	}
}
