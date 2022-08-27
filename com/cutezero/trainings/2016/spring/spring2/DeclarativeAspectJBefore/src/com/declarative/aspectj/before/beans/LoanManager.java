package com.declarative.aspectj.before.beans;

public class LoanManager {

	public boolean approveLoan(String loanNo){
		System.out.println(" Loan has been approved ");
		return true;
	}
}
