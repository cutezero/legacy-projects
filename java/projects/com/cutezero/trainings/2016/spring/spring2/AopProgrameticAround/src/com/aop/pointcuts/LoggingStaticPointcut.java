package com.aop.pointcuts;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.aop.beans.Calculator;

public class LoggingStaticPointcut extends StaticMethodMatcherPointcut{

	private int count;
	@Override
	public boolean matches(Method method, Class<?> classType) {
		if(classType.isAssignableFrom(Calculator.class) && method.getName().equals("add")){
			System.out.println("Coutnt : "+count++);
			return true;
		}
		if(classType.isAssignableFrom(Calculator.class) && method.getName().equals("substract")){
			System.out.println("Coutnt : "+count++);
			return true;
		}
		System.out.println("Coutnt : "+count++);
		return false;
	}

	
}
