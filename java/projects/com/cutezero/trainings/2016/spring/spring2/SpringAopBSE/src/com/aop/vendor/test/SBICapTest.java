package com.aop.vendor.test;

import com.aop.vendor.SBICap;

public class SBICapTest {

	public static void main(String[] args) {

		double price= 0;
		SBICap tradingApp= new SBICap();
		price=tradingApp.findStockPrice("SBI");
		System.out.println("Stock Price is : "+price);
		
	}

}
