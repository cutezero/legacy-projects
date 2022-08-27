package com.cfn.po;

public class Address {

	private String area;
	private String city;
	private int zip;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", zip=" + zip
				+ "]";
	}
	public Address(int zip) {
		super();
		this.zip = zip;
	}
	public Address() {
		super();
	}
	public Address(int zip, String area, String city) {
		super();
		this.zip = zip;
		this.area = area;
		this.city = city;
	}
	
}
