package com.aop.before.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.aop.before.helper.AuthenticationHelper;

public class SecurityCheckAdvice implements MethodBeforeAdvice {

	AuthenticationHelper helper = AuthenticationHelper.getInstance();

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {

		if (method.getName().equals("approveLoan"))
			if (!helper.authenticate())
				// throw new IllegalAccessException("Username or Password is
				// incorrect");
				throw new IllegalAccessError("Username or Password is incorrect");
	}

}
