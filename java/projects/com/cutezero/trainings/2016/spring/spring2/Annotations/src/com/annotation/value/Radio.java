package com.annotation.value;

import org.springframework.beans.factory.annotation.Autowired;

public class Radio {
	
	@Autowired
	private Reciever reciever;
	
	public void listen(){
		System.out.println("Listening ....");
		System.out.println(reciever);
	}

	@Override
	public String toString() {
		return "Radio [reciever=" + reciever + "]";
	}
	
	
}
