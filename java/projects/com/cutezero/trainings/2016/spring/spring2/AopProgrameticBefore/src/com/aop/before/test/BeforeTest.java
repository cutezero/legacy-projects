package com.aop.before.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aop.before.aspects.AuditAdvice;
import com.aop.before.aspects.SecurityCheckAdvice;
import com.aop.before.beans.LoanManager;
import com.aop.before.helper.AuthenticationHelper;

public class BeforeTest {

	public static void main(String[] args) {

		ProxyFactory factory= new ProxyFactory();
		factory.setTarget(new LoanManager());
		factory.addAdvice(new AuditAdvice());
		factory.addAdvice(new SecurityCheckAdvice());
		
		LoanManager loanManager= (LoanManager) factory.getProxy();
		
		AuthenticationHelper.getInstance().login("Srikanta", "Panigrahy2");
		loanManager.approveLoan("54894598");
		System.out.println("Completed");
	}

}
