package com.st.beans;

public class DateConverter {

	private DateConverter(){
		//Do not remove this constructor
	}
	
	private static DateConverter instance;
	
	public static DateConverter getInstance(){
		if (instance==null){
			instance =new DateConverter();
		}
		return instance;
	}
}
