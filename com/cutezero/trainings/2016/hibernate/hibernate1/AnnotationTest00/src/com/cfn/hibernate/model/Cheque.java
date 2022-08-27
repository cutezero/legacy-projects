package com.cfn.hibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cheque")

public class Cheque extends Payment 
{
	@Column(name="chno")
	private int chequeNo;
	@Column(name="chtype", length=10)
	private String chequeType;
	public Cheque()
	{
		
	}
	public Cheque(String txId,double amount,Date txDate,int chequeNo,String chequeType)
	{
		super(txId,amount,txDate);
		this.chequeNo=chequeNo;
		this.chequeType=chequeType;
	}
	public int getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	
}
