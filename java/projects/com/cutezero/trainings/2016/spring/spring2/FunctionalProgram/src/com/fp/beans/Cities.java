package com.fp.beans;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Cities {

	boolean found = false;

	public boolean checkCity(List<String> cities) {
		for (String city : cities) {
			if (city.equals("Chicago")) {
				found = true;
				break;
			}
		}
		System.out.println("Found : ?"+found);
		return found;
	}
	
	public void method1(){
		final List<BigDecimal> prices= Arrays.asList(new BigDecimal("10"), new BigDecimal("109"), new BigDecimal("89"));
	}
	
	public void discountImperetive(List<BigDecimal> prices){
		BigDecimal totalDiscountPrices= BigDecimal.ZERO;
		for(BigDecimal price : prices){
			if(price.compareTo((BigDecimal.valueOf(20))> 0)){
				totalDiscountPrices= totalDiscountPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
			}
		}
		totalDiscountPrices=
				prices.stream()
				.filter(arg0)
	}
}
