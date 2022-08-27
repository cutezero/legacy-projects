package com.annotation.aspectj.config.pointcuts;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public abstract class KeyCheckPointcut {

	@Pointcut("this(com.annotation.aspectj.config.beans.KeyGenerator) ")
	public void keyCheckPointcut1(){
		/**
		 * in case of global pointcut we can have pointcut in an 
		 * abstract class and we can use by inheriting it in all the aspects
		 */
	}
}
