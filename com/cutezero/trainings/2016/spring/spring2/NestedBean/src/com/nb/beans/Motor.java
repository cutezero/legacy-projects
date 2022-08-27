package com.nb.beans;

public class Motor {

	private int motorId;
	private String motorType;
	public void setMotorId(int motorId) {
		this.motorId = motorId;
	}
	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}
	@Override
	public String toString() {
		return "Motor [motorId=" + motorId + ", motorType=" + motorType + "]";
	}
	
}
