package com.pdi.beans;

public class Account {

	private String accountHolderName;
	private int accountNo;
	
	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accountNo=" + accountNo + "]";
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
}
