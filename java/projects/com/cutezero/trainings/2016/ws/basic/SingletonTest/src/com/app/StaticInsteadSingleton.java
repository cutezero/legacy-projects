package com.app;

import java.util.Calendar;
import java.util.Date;

public abstract class StaticInsteadSingleton {

	public static Date getTodayDate(){
		return Calendar.getInstance().getTime();
	}
	public static String getMessage(){
		return "I am from static Class";
	}
	
}
