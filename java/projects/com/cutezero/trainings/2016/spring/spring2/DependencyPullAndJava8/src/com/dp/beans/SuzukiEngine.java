package com.dp.beans;

public class SuzukiEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("Suzuki Engine is driving");
		System.out.println("Hash code from Suzuki Engine's start(): "+this.hashCode());
	}

	
}
