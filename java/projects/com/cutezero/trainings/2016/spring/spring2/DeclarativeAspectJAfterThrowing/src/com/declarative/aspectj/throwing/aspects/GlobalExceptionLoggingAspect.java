package com.declarative.aspectj.throwing.aspects;

import org.aspectj.lang.JoinPoint;

public class GlobalExceptionLoggingAspect {

	public void logException(JoinPoint jp, IllegalArgumentException iae){
		String methodName= null;
		Object[] args= null;
		
		methodName= jp.getSignature().getName();
		args= jp.getArgs();
		
		System.out.println(" Target method : "+ methodName+"(" + args[0]+") : thrown an exception : "+iae.getMessage());
	}
}
