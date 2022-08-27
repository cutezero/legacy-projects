package com.cfn.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Autowired
	private Sensor sensor;
	@Autowired
	private Chip chip;
	
	public String walk() {
		System.out.println("Robot.walk()");
		System.out.println(sensor.observe());
		return "Walking with chip : "+chip.chipDetails();
	}
}
