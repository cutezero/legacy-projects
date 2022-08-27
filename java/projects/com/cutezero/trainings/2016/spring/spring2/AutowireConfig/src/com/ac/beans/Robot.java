package com.ac.beans;

public class Robot {

	private Chip chip;
	private Sensor sensor;
	
	/*public Robot(Sensor sensor) {
		super();
		this.sensor = sensor;
	}

	public Robot(Chip chip) {
		super();
		this.chip = chip;
	}
*/
	@Override
	public String toString() {
		return "Robot [chip=" + chip + ", sensor=" + sensor + "]";
	}

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}


	/*public Robot(Chip chip, Sensor sensor) {
		super();
		this.chip = chip;
		this.sensor = sensor;
	}*/

}
