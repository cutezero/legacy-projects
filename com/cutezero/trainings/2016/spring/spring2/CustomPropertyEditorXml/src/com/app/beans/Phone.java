package com.app.beans;

public class Phone {

	private String phoneNumber;
	private PhoneType phoneType;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public PhoneType getPhoneType() {
		return phoneType;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}
	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + ", phoneType=" + phoneType + "]";
	}
	
}
