package com.aop.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName=null;
		Object[] args=null;
		
		methodName=methodInvocation.getMethod().getName();
		args=methodInvocation.getArguments();
		
		//Control point 1
		//args[1]=23;	//We can modify the arguments by just modifying the args 
		System.out.print("Executing the method : "+methodName +"(");
		for (int i=0; i<args.length;i++){
			if(i==0){
				System.out.print(args[i]);
				continue;
			}
			System.out.print(", "+args[i]);
			
		}
		System.out.print(")"+"\n");
		//Control point 2 
		Object obj=methodInvocation.proceed();	//we may call or may not call the actual mathod its in our control
		System.out.println("returning from the method : "+methodName +", with return value : "+obj);
		
		//Control point 3 
		//obj=57;	//we can controll the returntype which need to be returned 
		return obj;
	}

	
}
