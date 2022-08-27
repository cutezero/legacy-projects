package com.aop.before.beans;

public class LoanManager {

	public boolean approveLoan(String loanNo){
		boolean flag= false;
		
		if (loanNo!= null)
			flag= true;
		
		System.out.println("Loan NO is : "+loanNo);
		return flag;
	}
}
