package com.app.bean;

public class AwbNo {

	protected String destination;
	protected int zipCode;
	
	
	
	public AwbNo(String destination, int zipCode) {
		super();
		this.destination = destination;
		this.zipCode = zipCode;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "AwbNo [destination=" + destination + ", zipCode=" + zipCode + "]";
	}
	
	
}
