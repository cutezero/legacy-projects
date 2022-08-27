package com.mr.beans;

public class PlanFinder {

	public String[] findPlan(int age, int zip, String gender, int coverageType, int networkType, int coPay){
		System.out.println("Original Logic Running");
		System.out.println("Age : "+age+", zip : "+zip+", gender : "+gender+", coverageType : "+coverageType
				+", Network type : "+networkType+", copay : "+coPay);
		
		return new String[]{"Plan1", "Plan2"};
	}
}
