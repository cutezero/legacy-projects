package com.aop.after.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class NotifierAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object targetClass) throws Throwable {

/*		System.out.println(" Return Value : "+returnValue);
		System.out.println(" Method : "+method.getName());
		System.out.println(" args : "+args);
		System.out.println(" Target : "+targetClass);
*/		
		String methodName= null;
		methodName= method.getName();
		int amount= (int) args[1];
		if (returnValue.equals("Failed")){
			throw new IllegalArgumentException("your Recharge has been failed(Invalid Amount). Please try again after sometime  " );
		}
		else if (amount==1000){
			System.out.println(" Dear User you are eligible for Bonus power Pack ");
		}
		else{
			System.out.println(" Dear User you are Recharged with "+amount);
		}
	}
}
