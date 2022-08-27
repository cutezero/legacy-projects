package com.declarative.aspectj.afterreturn.aspects;

import org.aspectj.lang.JoinPoint;

public class KeyCheckAspect {

	//This is the respective signature for the after-returning advice
	public void checkKeystrength(JoinPoint joinPoint, Object returnValue){
		String methodName= null;
		Object[] args= null;
		
		methodName= joinPoint.getSignature().getName();
		args=joinPoint.getArgs();
		
		if ((int)returnValue==0)
			throw new IllegalArgumentException("Its a weak key. Please try to generate again ");
		System.out.println(" Executed method : "+methodName+"("+args[0]+")");
		
	}
}
