package com.aop.provider;

import java.util.Random;
import java.util.UUID;

public class BSEStockTrade {

	public double getStockPrice(String stockName){

//		System.out.println("Time from BSE : "+System.currentTimeMillis());
//		System.out.println("Random Number : "+new Random().nextInt(999));
		double price=0.0;
		switch (stockName) {
		case "CIPLA":
			price=1023;
			break;
		case "SBI":
			price=2023;
			break;
		case "TATA":
			price=3033;
			break;
		case "RIL":
			price=4567;
			break;
		default:
//			price=23454343;
			price=new Random().nextInt(999);
			break;
		}
		return price;
	}
}
