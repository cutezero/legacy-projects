package com.app.model;

import java.util.StringTokenizer;

public class CustomDate {

	protected int dd;
	protected int mm;
	protected int yyyy;
	
	public CustomDate(String date) {
//		String tempDate= null;
		StringTokenizer tokenizer= new StringTokenizer(date, "-");
		dd= Integer.parseInt(tokenizer.nextToken());
		mm= Integer.parseInt(tokenizer.nextToken());
		yyyy= Integer.parseInt(tokenizer.nextToken());
	
	}
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}

	@Override
	public String toString() {
		return "CustomDate [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}
	
	
	
}
