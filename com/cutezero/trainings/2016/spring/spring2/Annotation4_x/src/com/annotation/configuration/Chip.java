package com.annotation.configuration;

public class Chip {

	protected int chipNo;
	protected int ageGroup;
	
	public Chip(){
		System.out.println("Chip()");
	}
	public void setChipNo(int chipNo) {
		this.chipNo = chipNo;
	}
	public void setAgeGroup(int ageGroup) {
		this.ageGroup = ageGroup;
	}
	@Override
	public String toString() {
		return "Chip [chipNo=" + chipNo + ", ageGroup=" + ageGroup + "]";
	}
	
	
}
