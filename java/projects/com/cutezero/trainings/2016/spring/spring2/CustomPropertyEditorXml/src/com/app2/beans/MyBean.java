package com.app2.beans;

public class MyBean {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MyBean [price=" + price + "]";
	}
	
}
