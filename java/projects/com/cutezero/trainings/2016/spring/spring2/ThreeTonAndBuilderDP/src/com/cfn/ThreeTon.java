package com.cfn;

public class ThreeTon {

	private ThreeTon(){
		//Singleton purpose
	}
	
	private static ThreeTon instance;
	private static int counter;
	
	public static synchronized ThreeTon getInstance(){
		if(counter<= 2){
			instance= new ThreeTon();
			counter++;
		}
		return instance;
	}
}
