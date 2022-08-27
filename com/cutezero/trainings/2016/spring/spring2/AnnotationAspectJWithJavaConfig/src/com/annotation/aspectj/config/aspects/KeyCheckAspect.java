package com.annotation.aspectj.config.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.annotation.aspectj.config.pointcuts.KeyCheckPointcut;

@Component
@Aspect
public class KeyCheckAspect extends KeyCheckPointcut{

	// This is the respective signature for the after-returning advice
	@AfterReturning(value="keyCheckPointcut1()", returning="returnValue")	//inheriting global pointcut 
//	@AfterReturning(value="within(com.annotation.aspectj.config.beans.KeyGenerator)", returning="returnValue" )	//inheriting global pointcut
	public void checkKeyStrength(JoinPoint joinPoint, Object returnValue) {
		String methodName = null;
		Object[] args = null;
		methodName = joinPoint.getSignature().getName();
		args = joinPoint.getArgs();

		if ((int) returnValue == 0)
			throw new IllegalArgumentException("Its a weak key. Please try to generate again ");
		System.out.println(" Executed method : " + methodName + "(" + args[0] + ")");

	}
}
