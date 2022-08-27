package com.aop.before.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.aop.before.helper.AuthenticationHelper;

public class AuditAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {

		String someone= null;
		someone= "Someone";
		someone=AuthenticationHelper.getInstance().getLoggedInUser();
		
		System.out.print(someone+" is trying to access : " + method.getName() + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0){
				System.out.print(args[i]); 
				continue;
			}
			System.out.println(", "+args[i]);
		}
		System.out.println(")");
		args[0]+="-M";
	}

}
