package com.don.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class LoanFinder {

	private Cache cache;
	private String name;
	private double princpalAmount;
	private int tenureInYears;
	private String place;
	private float interestRate;
	private double totalAmount;
	Properties properties;
	
	public void setCache(Cache cache) {
		this.cache = cache;
	}
	public double findLoan(String place, double interestAmount, int tenureInYear) throws Exception{
		totalAmount=calculateLoan(interestAmount, tenureInYear, place);
		System.out.println("Total Amount Payble is : "+totalAmount);
		return totalAmount;
	}
	public double calculateLoan(double princpalAmount, int tenureInYear, String place) throws Exception{
		//check the data exists in the Cache or not?
		if (!cache.containsKey(IAccessor.KEY_PLACE_IR))
			throw new Exception("The details are not in cache");
		
		//check the place exists in the Properties object or not?
		properties=(Properties)cache.get(IAccessor.KEY_PLACE_IR);
		if (!properties.containsKey(place))
			throw new Exception("Loan not available for this place");
		
		//retrieve the data from properties
		interestRate=Float.parseFloat(properties.getProperty(place));
		System.out.println("Interest rate : "+interestRate);
		totalAmount=(princpalAmount*tenureInYear*interestRate)/100;
		return totalAmount;
	}
	public String getCity(){
		List<String> cities= new ArrayList<String>();
		cities=(List<String>)cache.get(IAccessor.KEY_CITY_LIST);
		System.out.println("cities : "+cities);
		String city=(String) cities.get(1);
		return city;
	}
}
