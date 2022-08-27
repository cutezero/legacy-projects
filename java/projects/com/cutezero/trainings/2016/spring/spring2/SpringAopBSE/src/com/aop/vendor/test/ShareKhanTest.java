package com.aop.vendor.test;

import com.aop.vendor.ShareKhan;

public class ShareKhanTest {

	/**
	 * This class is successfully working ... compared to ICICIDirect and SBICap
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		ShareKhan shareKhan=new ShareKhan();
		double price1=shareKhan.findStockPrice("CIPLA");
		double price2=shareKhan.findStockPrice("airtel");
		double price3=shareKhan.findStockPrice("jio");
		double price4=shareKhan.findStockPrice("jio");
		System.out.println("Price1  : "+price1);
		System.out.println("Price2  : "+price2);
		System.out.println("Price3  : "+price3);
		System.out.println("Price4  : "+price4);
		Thread.sleep(15000);
		double price5=shareKhan.findStockPrice("jio");
		double price6=shareKhan.findStockPrice("airtel");
		double price7=shareKhan.findStockPrice("jio");
		System.out.println("Price5  : "+price5);
		System.out.println("Price6  : "+price6);
		System.out.println("Price7  : "+price7);
	}

}
