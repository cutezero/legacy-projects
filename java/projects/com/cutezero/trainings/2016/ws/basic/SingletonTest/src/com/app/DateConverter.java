package com.app;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

abstract public class DateConverter {

	/*private static DateConverter dateConverter;
	private DateConverter(){
		
	}
	*/
	public static synchronized DateConverter getDateConverter(){
		/*if (dateConverter==null){
			dateConverter=new DateConverter();
		}
		return dateConverter;
		*/
		
		return AdvancedDateConverter.getDateConverter();
		
	}
	
	public synchronized Date String2Date(String sDate){
		SimpleDateFormat dateFormat=new SimpleDateFormat();
		Date today=Calendar.getInstance().getTime();
		return today;
	}
	
	public synchronized String Date2String(Date date, String pattern){
		
		//fortoday's date
		Date today=Calendar.getInstance().getTime();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat();
		return pattern;
	}
}
