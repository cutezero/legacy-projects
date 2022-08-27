package com.dp.beans;

public class YamahaEngine implements IEngine{

	@Override
	public void start() {
		System.out.println("Yamaha Engine driving");
		System.out.println("Hash code from Yamaha Engine's start(): "+this.hashCode());
	}

	
}
