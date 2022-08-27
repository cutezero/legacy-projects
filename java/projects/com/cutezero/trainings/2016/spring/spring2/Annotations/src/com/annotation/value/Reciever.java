package com.annotation.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Reciever {

//	@Value("12445")	//Value has been hard-coded so we need to use Spring expresion
	@Value("#{premitiveValuesFile.Reciever_frequency}")	
	private int frequency;

	@Override
	public String toString() {
		return "Reciever [frequency=" + frequency + "]";
	}

	
	
}
