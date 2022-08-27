package com.declarative.aspectj.around.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
		String methodName=null;
		String className= null;
		Object[] args= null;
		Object target=null;
		
		methodName=joinPoint.getSignature().getName();
		args=joinPoint.getArgs();
		className=joinPoint.getClass().getName();
		target= joinPoint.getThis();
		System.out.println("Entering into method : "+methodName+ "("+args[0]+", "+args[1]+")");
		args[0]=(int)args[0]+1;
		args[1]=(int)args[1]+1;
//		Object returnValue=joinPoint.proceed();	//if we don't pass anything as parameter then modified parameter will not reflect on execution
		Object returnValue=joinPoint.proceed(args);	//here modified parameters will reflect in the execution of target class method
		
		returnValue=(int)returnValue*10;	//we can modify the return value
		System.out.println("Exiting from method : "+methodName+" With return value : "+returnValue);
		
		return returnValue;
	}
}
