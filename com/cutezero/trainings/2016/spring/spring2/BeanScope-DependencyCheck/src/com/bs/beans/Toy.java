package com.bs.beans;

public class Toy {

	private int toyId;
	private String toyName;
	private Motor motor;
	public void setToyId(int toyId) {
		this.toyId = toyId;
	}
	public void setToyName(String toyName) {
		this.toyName = toyName;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Toy [toyId=" + toyId + ", toyName=" + toyName + ", motor=" + motor + "]";
	}
	
}
