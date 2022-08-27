package com.annotation.aspectj.config.beans;

import org.springframework.stereotype.Component;

@Component
public class LoanManager {

	public boolean approveLoan(String loanNo){
		System.out.println("loan has approved");
		return true;
	}
}
