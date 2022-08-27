package com.ns.beans;

public class Toy {

	private int toyId;
	private String toyname;
	private Motor motor;
	public void setToyId(int toyId) {
		this.toyId = toyId;
	}
	public void setToyname(String toyname) {
		this.toyname = toyname;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Toy [toyId=" + toyId + ", toyname=" + toyname + ", motor=" + motor + "]";
	}
	
	
}
