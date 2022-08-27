package com.ib.beans;

public class Bicycle {

	private String brand;
	private Chain chain;
	@Override
	public String toString() {
		return "Bicycle [brand=" + brand + ", chain=" + chain + "]";
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setChain(Chain chain) {
		this.chain = chain;
	}
	
}
