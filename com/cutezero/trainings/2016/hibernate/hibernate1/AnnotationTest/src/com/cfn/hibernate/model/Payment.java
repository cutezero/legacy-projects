package com.cfn.hibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="payments")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="pmode", discriminatorType=DiscriminatorType.STRING, length=10)
public abstract class Payment 
{
	@Id
	@Column(length=10)
	private String txId;
	private double amount;
	@Temporal(TemporalType.DATE)
	private Date txDate;
	
	public Payment()
	{
		
	}
	public Payment(String txId,double amount,Date txDate)
	{
		this.txId=txId;
		this.amount=amount;
		this.txDate=txDate;
	}
	public String getTxId() {
		return txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getTxDate() {
		return txDate;
	}
	public void setTxDate(Date txDate) {
		this.txDate = txDate;
	}
	
}
