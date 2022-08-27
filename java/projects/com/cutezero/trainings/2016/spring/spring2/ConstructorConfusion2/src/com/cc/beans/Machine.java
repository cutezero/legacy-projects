package com.cc.beans;

import java.beans.ConstructorProperties;

public class Machine {

	private int modelNo;
	private String name;
	private double slNo;
	
	@ConstructorProperties(value={"name", "slNo"})
	public Machine(double slNo, String name) {
		super();
		this.slNo = slNo;
		this.name = name;
	}
	@ConstructorProperties(value={ "name","modelNo", "slNo"})
	public Machine( String name,int modelNo, double slNo) {
		super();
		this.modelNo = modelNo;
		this.name = name;
		this.slNo = slNo;
	}
//	@ConstructorProperties(value={"modelNo", "name", "slNo"})
	public Machine(int modelNo, String name, double slNo) {
		super();
		this.modelNo = modelNo;
		this.name = name;
		this.slNo = slNo;
	}
	@Override
	public String toString() {
		return "Machine [modelNo=" + modelNo + ", name=" + name + ", slNo=" + slNo + "]";
	}
	
	
}
