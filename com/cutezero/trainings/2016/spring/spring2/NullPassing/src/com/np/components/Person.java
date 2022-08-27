package com.np.components;

public class Person {

	private String name;
	private long ssn;
	private Address address;
	
	
	public Person(String name, long ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", ssn=" + ssn + ", address=" + address + "]";
	}
	
	
	
}
