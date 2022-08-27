package com.hdfc.netbanking.vo;

import java.util.Date;

public class ReceiptVO {

	protected String transactionId;
	protected Date transactionDate;
	protected String fromAccont;
	protected String toAccount;
	protected double amount;
	protected String status;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getFromAccont() {
		return fromAccont;
	}
	public void setFromAccont(String fromAccont) {
		this.fromAccont = fromAccont;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
