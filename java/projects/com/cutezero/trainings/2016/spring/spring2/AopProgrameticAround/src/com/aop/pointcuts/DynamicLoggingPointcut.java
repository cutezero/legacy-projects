package com.aop.pointcuts;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.aop.beans.Calculator;

public class DynamicLoggingPointcut extends DynamicMethodMatcherPointcut{

	private int count=0;
	@Override
	public boolean matches(Method method, Class<?> classType, Object[] args) {
		if (classType.isAssignableFrom(Calculator.class) && method.getName().equals("add") && (Integer)args[0] > 100 && (Integer) args[1] > 100){
			System.out.println(" True Count : "+count++);
			return true;
		}
		System.out.println("False Count : "+count++);
		return false;
	}

	
}
