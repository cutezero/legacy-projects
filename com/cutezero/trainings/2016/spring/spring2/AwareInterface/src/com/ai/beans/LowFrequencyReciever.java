package com.ai.beans;

public class LowFrequencyReciever implements IReciever{

	@Override
	public void transmit(float frequency) {
		System.out.println("Low frequency transmitting");
	}

	@Override
	public String recieve() {
		return "Low frequency recieving";
	}

	
}
