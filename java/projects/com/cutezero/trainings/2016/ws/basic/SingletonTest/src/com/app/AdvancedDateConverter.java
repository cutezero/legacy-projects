package com.app;

public class AdvancedDateConverter extends DateConverter {

	private static AdvancedDateConverter dateConverter;
	private AdvancedDateConverter(){
		
	}
	public static synchronized DateConverter getDateConverter(){
		if (dateConverter==null){
			dateConverter=new AdvancedDateConverter();
		}
		return dateConverter;
	}
	public synchronized String getTimeZone(){
		return "IST +5:30";
	}
}
