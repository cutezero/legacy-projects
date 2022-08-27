package com.declarative.aspectj.around.aspects;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.aspectj.lang.ProceedingJoinPoint;

import com.declarative.aspectj.around.util.Cache;

public class CacheAspect {

	private Cache cache;
	
	public void setCache(Cache cache) {
		this.cache = cache;
	}

	public Object cache(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		String methodName= null;
		Object[] args= null;
		String key= null;
		Object returnValue= null;
		
		methodName= proceedingJoinPoint.getSignature().getName();
		args=proceedingJoinPoint.getArgs();
		
		//build the key
		key+= methodName+"(";
		for(int i=0; i<args.length; i++){
			if(i==0){
				key+= args[i];
				continue;
			}
			key+= ", "+args[i];
			
		}
		key+= ")";
		
		if(cache.containsKey(key)){
			return cache.get(key);
		}
		
		returnValue=proceedingJoinPoint.proceed();
		
		cache.put(key, returnValue);
		return returnValue;
		
	}
}
