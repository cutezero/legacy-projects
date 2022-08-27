package com.annotation.aspectj.config.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)	//which aspect need to apply in priority order
public class LoggingAspect {

	@Around("within(com.annotation.aspectj.config.beans.*)")
	public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		String methodName= null;
		Object[] args= null;
		
		methodName= proceedingJoinPoint.getSignature().getName();
		args= proceedingJoinPoint.getArgs();
		
		System.out.print("Entering in to : "+methodName+ " (");
		
		for(int i=0;i<args.length;i++){
			if(i==0){
				System.out.print(args[i]);
				continue;
			}
			System.out.print(", "+args[i]);
		}
		System.out.println(") ");
		
		Object returnValue=proceedingJoinPoint.proceed();
		
		System.out.println("Exiting from : "+methodName+ " with return value : "+returnValue);
		return returnValue;
	}
}
