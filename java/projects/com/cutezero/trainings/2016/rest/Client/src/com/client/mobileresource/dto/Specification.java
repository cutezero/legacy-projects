package com.client.mobileresource.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="specification")
public class Specification {

	private String model;
	private String brand;
	private int ramInGB;
	private double price;
	private int internalMemoryInGB;
	private float cameraResolutionInPx;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRamInGB() {
		return ramInGB;
	}
	public void setRamInGB(int ramInGB) {
		this.ramInGB = ramInGB;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getInternalMemoryInGB() {
		return internalMemoryInGB;
	}
	public void setInternalMemoryInGB(int internalMemoryInGB) {
		this.internalMemoryInGB = internalMemoryInGB;
	}
	public float getCameraResolutionInPx() {
		return cameraResolutionInPx;
	}
	public void setCameraResolutionInPx(float cameraResolutionInPx) {
		this.cameraResolutionInPx = cameraResolutionInPx;
	}
	
	
	
	
}
