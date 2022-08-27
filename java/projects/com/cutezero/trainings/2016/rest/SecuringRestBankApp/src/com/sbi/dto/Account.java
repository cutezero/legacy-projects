package com.sbi.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="account")
public class Account {

	@XmlElement(name="account-number")
	protected String accountNumber;
	@XmlElement(name="account-holder-name")
	protected String accountHolderName;
	@XmlElement(name="branch-code")
	protected String branchCode;
	@XmlElement(name="account-type")
	protected String accountType;
	@XmlElement(type=Float.class)
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
