package com.annotation.dependson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("cacheManager")
public class LoanCalculator {

	@Autowired
	private Cache cache;
	
	public double calculate(double princpalAmount, int tenure, String city, int cityId){
		System.out.println("Calculating .....");
		System.out.println("Rate of Interest is : "+cache.getDataMap().get(city));
		int rate= (int) cache.getDataMap().get(city);
		System.out.println("Rate of Interest is : "+rate);
		return princpalAmount*tenure;
	}
}
