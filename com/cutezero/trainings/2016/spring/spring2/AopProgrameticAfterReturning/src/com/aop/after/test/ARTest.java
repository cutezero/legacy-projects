package com.aop.after.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aop.after.aspects.NotifierAdvice;
import com.aop.after.beans.OnlineRecharge;

public class ARTest {

	public static void main(String[] args) {

		ProxyFactory factory= new ProxyFactory();
		factory.setTarget(new OnlineRecharge());
		factory.addAdvice(new NotifierAdvice());
		
		OnlineRecharge recharge= (OnlineRecharge) factory.getProxy();
		
		recharge.rechargeMobile("9889899889", 78);
		System.out.println(" Done ");
	}

}
