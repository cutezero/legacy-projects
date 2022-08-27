package com.aop.throwing.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * Unless like other advices 'ThrowsAdvice' is an Marker Interface 
 * But still we need to write a standard method signature as below 2 methods
 * @author Srikanta.ydon
 *
 */
public class ThrowingAdvice implements ThrowsAdvice{

	public void afterThrowing(IllegalArgumentException e){
		System.out.println(e.getMessage());
	}
	public void afterThrowing(Method method, Object[] args, Object target, Exception e){
		System.out.println("Method : "+method.getName()+" Error Details :"+e.getMessage());
	}
	
	public void afterThrowing(Method method, Object[] args, Object target, IllegalArgumentException e){
		System.out.println("Method : "+method.getName()+" Error Details :"+e.getMessage());
	}
}
