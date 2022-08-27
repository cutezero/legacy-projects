package com.sbi.dto;

public class Account {

	protected String accountNumber;
	protected String accountHolderName;
	protected String branchCode;
	protected String accountType;
	protected double balance;

	
	
	public Account() {
		super();
	}
	public Account(String accountNumber, String accountHolderName, String branchCode, String accountType,
			double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.branchCode = branchCode;
		this.accountType = accountType;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
