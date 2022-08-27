package com.app;

import java.util.Date;

public class SingletonTest {

	public static void main(String[] args) {
		DateConverter dateConverter= DateConverter.getDateConverter();
		Date date=dateConverter.String2Date("25-12-1992");
		System.out.println("DateConverter : String 2 date "+date);
		System.out.println("Static Class"+StaticInsteadSingleton.getMessage());
		System.out.println("Static Class extended"+StaticExtended.getMessage());
		System.out.println("Static Class extended date from base"+StaticExtended.getTodayDate());
		
		//how to get method name from stacktrace
		StackTraceElement[] element= Thread.currentThread().getStackTrace();
		for (StackTraceElement element2: element){
			System.out.println(element2);
		}
	}

}
