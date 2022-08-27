package com.declarative.aspectj.before.aspect;

import org.aspectj.lang.JoinPoint;

import com.declarative.aspectj.before.helper.AuthenticationHelper;

public class SecurityAspect {
	private AuthenticationHelper helper;
	
	public void setHelper(AuthenticationHelper helper) {
		this.helper = helper;
	}

	//we have to write the method signature with respect to the advice we want to apply
	public void audit(JoinPoint joinPoint){	//Auditing cross-cutting logic 
		String methodName= null;
		Object[] args= null;
		methodName= joinPoint.getSignature().getName();
		args=joinPoint.getArgs();
		String someone= "John Doe";
		System.out.println(someone + " trying to access : "+methodName+"("+args[0]+")");
	}
	
	public void verify(JoinPoint joinPoint) throws IllegalAccessException{
		String methodName= null;
		Object[] args= null;
		methodName= joinPoint.getSignature().getName();
		args=joinPoint.getArgs();
		
		if(helper.isAuthenticated()==false) throw new IllegalAccessException("Invalid user/password");
	}
	
}
