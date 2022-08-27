package com.annotation.aspectj.xml.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.annotation.aspectj.xml.util.Cache;

@Component
@Aspect
public class CacheAspect {

	@Autowired
	private Cache cache;
	@Around("execution(* com.annotation.aspectj.xml.beans.Calculator.add(..))")
	public Object cacheIt(ProceedingJoinPoint point) throws Throwable {
		String methodName = null;
		Object[] args = null;
		String key = null;

		methodName = point.getSignature().getName();
		args = point.getArgs();

		key = methodName + "(";
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				key += args[i];
				continue;
			}
			key += ", " + args[i];
		}
		key += ") ";

		if (cache.containsKey(key)) {
			return cache.get(key);
		}
		Object returnValue = point.proceed();
		cache.put(key, returnValue);
		return returnValue;
	}
}
