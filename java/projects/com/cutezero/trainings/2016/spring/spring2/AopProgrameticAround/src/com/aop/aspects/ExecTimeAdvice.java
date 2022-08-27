package com.aop.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ExecTimeAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName= null;
		String className= null;
		Object[] args= null;
		long entryTime=0;
		long exitTime=0;
		long execTime= 0;
		String methodSign= null;
		
		className= methodInvocation.getClass().getName();
		methodName= methodInvocation.getMethod().getName();
		args= methodInvocation.getArguments();
		
//		System.out.println(" Class Name : "+className );
		methodSign=" Method : "+methodName+"(";
		
		
		for( int i=0;i<args.length;i++){
			if (i==0){
				methodSign+=args[i];
				continue;
			}
			methodSign+=", "+args[i];
		}
		methodSign+=")";
		
		entryTime=System.currentTimeMillis();
		Object returnValue=methodInvocation.proceed();
		exitTime=System.currentTimeMillis();
		execTime=exitTime-entryTime;
//		System.out.println("Method Sign "+" : "+" Execution Time ");
		System.out.println("--------------------------------------");
		System.out.println(methodSign+" : "+execTime);
		return returnValue;
	}

	
}
