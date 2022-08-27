
package com.cfn.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MyAspect {

	@After("execution(* com.*.*.*.m1(..))")
	public void after(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		System.out.println("method name is: "+methodName);
	}
	
	@Around("execution(* com.*.*.*.m2(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint){
		Object o=null;
		try{
			long x= System.currentTimeMillis();
			
			o=proceedingJoinPoint.proceed();
			
			long y= System.currentTimeMillis();
			
			String methodName=proceedingJoinPoint.getSignature().getName();
			System.out.println("Method Name is: "+methodName);
			System.out.println("Time taken: "+(y-x)+"milliseconds");
		}catch (Throwable e) {
			// TODO: handle exception
		}
		return o;
	}
	
}
