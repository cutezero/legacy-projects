package com.ai.beans;

public class HighFrequencyReciever implements IReciever{

	@Override
	public void transmit(float frequency) {
		System.out.println("High frequency transmitting "+frequency);
	}

	@Override
	public String recieve() {
		//System.out.println("High frequency transmitting ");
		return "High frequency recieving : ";
	}

}
