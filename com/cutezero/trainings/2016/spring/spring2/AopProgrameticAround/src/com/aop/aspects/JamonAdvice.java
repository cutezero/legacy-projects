package com.aop.aspects;

import java.io.FileWriter;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;

public class JamonAdvice implements MethodInterceptor{
	
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName= null;
		String className= null;
		Object[] args= null;
		
		methodName= methodInvocation.getMethod().getName();
		className= methodInvocation.getClass().getName();
		args= methodInvocation.getArguments();
		
//		Monitor monitor= MonitorFactory.start("Label : "+methodName);
		Monitor monitor= MonitorFactory.start(methodName);
		Object returnvalue=methodInvocation.proceed();
		System.out.println(monitor);
//		System.out.println("First Access : "+monitor.getFirstAccess());
//		System.out.println("Last Access : "+monitor.getLastAccess());
		try {
			FileWriter fileWriter= new FileWriter("G:\\SRIMAN_SpringWorkspace\\AopProgrameticAround\\resources\\log.txt");
//			fileWriter.write("Execution Time of : "+ methodName+ " is : ");
			fileWriter.write("Execution Details of : "+ methodName+ " is : "+monitor);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		monitor.stop();
		return returnvalue;
	}

}
