package com.cfn.model;

public class Address {

	String area;
	String district;
	String State;
	long areaPin;
	
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getAreaPin() {
		return areaPin;
	}
	public void setAreaPin(long areaPin) {
		this.areaPin = areaPin;
	}
}
