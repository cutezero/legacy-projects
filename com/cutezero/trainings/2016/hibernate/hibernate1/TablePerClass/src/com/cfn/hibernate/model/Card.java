package com.cfn.hibernate.model;

import java.util.Date;

public class Card extends Payment {
	private int cardNo;
	private String cardType;
	public Card(){}
	public Card(String txId, double amount, Date txDate, int cardNo, String cardType){
		super(txId, amount, txDate);
		this.cardNo=cardNo;
		this.cardType=cardType;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	

}
