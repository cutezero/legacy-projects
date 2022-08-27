package com.cfn;

public class IntrinsicImpl implements IIntrinsic {
	
	public IntrinsicImpl(String compName, String division){
		this.compName=compName;
		this.division=division;
		count++;
	}
	
	private static int count;
	private String compName;
	private String division;
	
	@Override
	public String getDivision() {
		return division;
	}

	@Override
	public String getCompName() {
		return compName;
	}
	
	public static void showCount(){
		System.out.println("the number object created : "+count);
	}

}
