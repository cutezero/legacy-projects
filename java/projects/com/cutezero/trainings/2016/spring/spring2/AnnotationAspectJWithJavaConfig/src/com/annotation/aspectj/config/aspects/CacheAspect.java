package com.annotation.aspectj.config.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.annotation.aspectj.config.util.Cache;

@Component
@Aspect
@Order(2)
public class CacheAspect {
	@Autowired
	private Cache cache;

	@Around("execution(* com.annotation.aspectj.config.beans.Calculator.add(..))")
	public Object cache(ProceedingJoinPoint point) throws Throwable{
		String methodName= null;
		Object[] args= null;
		String key= null;

		methodName= point.getSignature().getName();
		args= point.getArgs();
		
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
		Object returnValue=point.proceed();
		
		//save the data in cache and then return the value
		cache.put(key, returnValue);
		return returnValue;

	}
}
