package com.bi.beans;

import java.beans.ConstructorProperties;

public class Bus {

	private int id;
	private String brand;
	private String model;
	private String fuelType;
	private String colour;
	private double price;
	/*
	public void setId(int id) {
		this.id = id;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setPrice(double price) {
		this.price = price;
	}*/
	
	
	@Override
	public String toString() {
		return "Bus [id=" + id + ", brand=" + brand + ", model=" + model + ", fuelType=" + fuelType + ", colour="
				+ colour + ", price=" + price + "]";
	}
	
	@ConstructorProperties({"id", "brand", "model", "fuelType", "colour", "price"})
	public Bus(int id, String brand, String model, String fuelType, String colour, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
		this.colour = colour;
		this.price = price;
	}
	
	
}
