package com.ac.beans;

public class Sensor {

	private int senserId;
	private String sensorType;
	
	public void setSenserId(int senserId) {
		this.senserId = senserId;
	}
	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}
	@Override
	public String toString() {
		return "Sensor [senserId=" + senserId + ", sensorType=" + sensorType + "]";
	}
	
}
