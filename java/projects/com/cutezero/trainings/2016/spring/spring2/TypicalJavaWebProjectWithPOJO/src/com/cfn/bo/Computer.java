package com.cfn.bo;

public class Computer {

	private String name;
	private double price;
	private String processor;
	private int ram;
	private int hdd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", price=" + price + ", processor=" + processor + ", ram=" + ram + ", hdd="
				+ hdd + "]";
	}
	
	
}
