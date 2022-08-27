package com.annotation.configuration;

public class Robot {

	protected int robotId;
	protected Chip chip;
	
	Robot(){
	}
	public void setRobotId(int robotId) {
		this.robotId = robotId;
	}
	public void setChip(Chip chip) {
		this.chip = chip;
	}
	@Override
	public String toString() {
		return "Robot [robotId=" + robotId + ", chip=" + chip + "]";
	}
	
	
	
}
