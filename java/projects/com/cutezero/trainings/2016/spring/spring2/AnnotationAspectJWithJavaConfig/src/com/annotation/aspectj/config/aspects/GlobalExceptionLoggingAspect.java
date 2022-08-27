package com.annotation.aspectj.config.aspects;

import java.nio.file.AccessDeniedException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;

import com.annotation.aspectj.config.pointcuts.GlobalExceptionPointcut;

@Component
@Aspect
public class GlobalExceptionLoggingAspect extends GlobalExceptionPointcut{

	String methodName = null;
	Object[] args = null;
	
	@AfterThrowing(value="globalExceptionPointcut()", throwing="iae")
	public void logException(JoinPoint joinPoint, IllegalArgumentException iae){
		methodName = joinPoint.getSignature().getName();
		args = joinPoint.getArgs();
		
		System.out.println("thrown by : "+methodName+ "("+args[0]+")"+"\n Exception message : "+iae.getMessage());
	}
	@AfterThrowing(value="globalExceptionPointcut()", throwing="iae")
	public void logException(IllegalArgumentException iae){
		System.out.println("thrown Exception message : "+iae.getMessage());
		
	}
	@AfterThrowing(value="globalExceptionPointcut()", throwing="aiobe")
	public void logException(JoinPoint joinPoint, ArrayIndexOutOfBoundsException aiobe){
		methodName = joinPoint.getSignature().getName();
		args = joinPoint.getArgs();
		System.out.println("thrown by : "+methodName+ "("+args[0]+")"+"\n Exception message : "+aiobe.getMessage());
	}
	@AfterThrowing(value="globalExceptionPointcut()", throwing="ade")
	public void logException(JoinPoint joinPoint, AccessDeniedException ade){
		System.out.println("thrown Exception message : "+ade.getMessage());
	}
	
	/**
	 * In case of annotation approach
	 * For each exception thrown by a class will be applied by all 
	 * matching Exception and its supper type as well
	 */
/*	@AfterThrowing(value="globalExceptionPointcut()", throwing="e")
	public void logException(JoinPoint joinPoint, Exception e){
		System.out.println("thrown Exception message : "+e.getMessage());
	}
	@AfterThrowing(value="globalExceptionPointcut()", throwing="e")
	public void logException(Exception e){
		System.out.println("thrown Exception message : "+e.getMessage());
	}*/
}
