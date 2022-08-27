package com.thymeleaf.dto;

import org.springframework.stereotype.Component;

@Component
public class Account {

	protected String accountNo;
	protected String name;
	protected double amount;
	protected String accountType;
	
	public Account(String accountNo, String name, double amount, String accountType) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.amount = amount;
		this.accountType = accountType;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
}
