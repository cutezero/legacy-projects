package com.cfn.beans;

import org.springframework.stereotype.Component;

@Component
public class Sensor {

	public String observe(){
		System.out.println("Sensor.observe()");
		return "Observing and walking ";
	}
}
