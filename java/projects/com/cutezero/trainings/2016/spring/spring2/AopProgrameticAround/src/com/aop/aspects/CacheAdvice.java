package com.aop.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aop.util.Cache;

public class CacheAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName= null;
		Object[] args= null;
		String key= null;
		
		Cache cache= null;
		methodName= methodInvocation.getMethod().getName();
		args= methodInvocation.getArguments();
		
		//Build the key
		key= methodName+"(";
		for( int i=0;i<args.length;i++){
			if(i==0){
//				key= key+args[i];
				key+= args[i];
				continue;	//instead of else its better to have 'continue' 
			}
			key+= ", "+args[i];
		}
		key+=")";
		
		//get the cache and check whether the data is available in cache, if found return from cache
		cache=Cache.getInstance();
		if( cache.containsKey(key)){
			return cache.get(key);
		}
		//if not found  in the cache execute the primary businessLogic
		Object returnValue=methodInvocation.proceed();
		
		//save the data in cache and then return the value
		cache.put(key, returnValue);
		return returnValue;
	}

	
}
