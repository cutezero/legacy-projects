package com.ns.beans;

public class Motor {

	private int motorId;
	private String motorType;
	
	public Motor(int motorId, String motorType) {
		super();
		this.motorId = motorId;
		this.motorType = motorType;
	}

	@Override
	public String toString() {
		return "Motor [motorId=" + motorId + ", motorType=" + motorType + "]";
	}

}
