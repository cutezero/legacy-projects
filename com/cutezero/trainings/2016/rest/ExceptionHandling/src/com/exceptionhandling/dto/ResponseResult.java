package com.exceptionhandling.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ResponseResult {

	protected String transactionId;
	protected String accountNo;
	protected String queryStatus;
	protected String messageDetails;
	protected double accountBalance;
	
	
	public ResponseResult() {
	}
	public ResponseResult(String transactionId, String accountNo, String queryStatus, String messageDetails,
			double accountBalance) {
		super();
		this.transactionId = transactionId;
		this.accountNo = accountNo;
		this.queryStatus = queryStatus;
		this.messageDetails = messageDetails;
		this.accountBalance = accountBalance;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getQueryStatus() {
		return queryStatus;
	}
	public void setQueryStatus(String queryStatus) {
		this.queryStatus = queryStatus;
	}
	public String getMessageDetails() {
		return messageDetails;
	}
	public void setMessageDetails(String messageDetails) {
		this.messageDetails = messageDetails;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
