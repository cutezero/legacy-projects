package com.annotation.aspectj.config.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.annotation.aspectj.config.helper.AuthenticationHelper;

@Component
@Aspect
@Order(1)
public class SecurityAspect {	//applied on LoanManager
	@Autowired
	private AuthenticationHelper helper;

	@Pointcut("target(com.annotation.aspectj.config.beans.LoanManager)")
	public void securityPointcut() {

	}

	@Before("securityPointcut()")	//audit
	@Order(1)
	public void audit(JoinPoint joinPoint) { // Auditing cross-cutting logic
		String methodName = null;
		Object[] args = null;
		String someone = null;
		methodName = joinPoint.getSignature().getName();
		args = joinPoint.getArgs();
		someone = helper.getLoggedinUser();
		if (args == null)
			System.out.println(someone + " trying to access : " + methodName + "()");
		System.out.println(someone + " trying to access : " + methodName + "(" + args[0] + ")");
	}

	@Before("securityPointcut()")	// login check
	@Order(2)
	public void verify(JoinPoint joinPoint) throws IllegalAccessException { 
		String methodName = null;	
		Object[] args = null;
		methodName = joinPoint.getSignature().getName();
		args = joinPoint.getArgs();

		if (helper.isAuthenticated() == false)
			throw new IllegalAccessException("Invalid user/password");
	}
}
