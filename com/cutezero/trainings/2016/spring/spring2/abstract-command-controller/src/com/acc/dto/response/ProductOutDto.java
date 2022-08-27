package com.acc.dto.response;

public class ProductOutDto {

	protected String name;
	protected String category;
	protected String brand;
	protected double price;
	
	public ProductOutDto() {
		super();
	}
	public ProductOutDto(String name, String category, String brand, double price) {
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}