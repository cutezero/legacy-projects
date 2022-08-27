
package com.aop.throwing.test;

import java.sql.SQLException;


import org.springframework.aop.framework.ProxyFactory;

import com.aop.throwing.aspect.ThrowingAdvice;
import com.aop.throwing.beans.AccountTransfer;

public class ATTest {

	public static void main(String[] args) throws SQLException {

		ProxyFactory factory= new ProxyFactory();
		factory.setTarget(new AccountTransfer());
		factory.addAdvice(new ThrowingAdvice());
		
		AccountTransfer transfer= (AccountTransfer) factory.getProxy();
		String result=transfer.transferFunds(100);
		System.out.println(result);
		System.out.println("DONE ");
	}

}
