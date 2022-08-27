package com.fb.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactoryBean implements FactoryBean<Calendar> {
	private int year;
	private int month;
	private int day;
	
	public CalendarFactoryBean(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public Class<?> getObjectType() {
		return Calendar.class;
	}
	
	@Override
	public Calendar getObject() throws Exception {
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, month, day);
		//Calendar calendar=Calendar.getInstance();
		return calendar;
	}
	
	@Override
	public boolean isSingleton() {
		return false;
	}
}
