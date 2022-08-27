package com.annotation.aspectj.config.pointcuts;

import org.aspectj.lang.annotation.Pointcut;

public class GlobalExceptionPointcut {

	@Pointcut("within(com.annotation.aspectj.config.beans.*)")
	public void globalExceptionPointcut(){
		//intentionally left blank
		//This method only defined for @Pointcut annotation
	}
}
