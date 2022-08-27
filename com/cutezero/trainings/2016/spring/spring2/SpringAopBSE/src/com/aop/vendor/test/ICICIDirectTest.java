package com.aop.vendor.test;

import com.aop.vendor.ICICIDirect;

public class ICICIDirectTest {

	public static void main(String[] args) throws InterruptedException {

/*		System.out.println("-----------------------");
		long l1=System.currentTimeMillis();
		System.out.println("Init Time : "+l1);
		Thread.sleep(15040);
		long l2=System.currentTimeMillis();
		System.out.println("Final Time : "+l2);
		System.out.println(l2-l1);
		System.out.println("-----------------------");
*/
		
		System.out.println("-----------------------");
		
		
		ICICIDirect iciciTrading= new ICICIDirect();
		double price=iciciTrading.findStockprice("SBI");
		double price2=iciciTrading.findStockprice("airtel");
		double price3=iciciTrading.findStockprice("jio");
		double price4=iciciTrading.findStockprice("jio");
		double price5=iciciTrading.findStockprice("jio");
		double price6=iciciTrading.findStockprice("jio");
		System.out.println("Price : "+price);
		System.out.println("Price2 : "+price2);
		System.out.println("Price3 : "+price3);
		System.out.println("Price4 : "+price4);
		System.out.println("Price5 : "+price5);
		System.out.println("Price6 : "+price6);
		Thread.sleep(3005);
		double price7=iciciTrading.findStockprice("jio");
		double price8=iciciTrading.findStockprice("jio");
		double price9=iciciTrading.findStockprice("jio");
		System.out.println(System.currentTimeMillis());
		System.out.println("Price7 : "+price7);
		System.out.println("Price8 : "+price8);
		System.out.println("Price9 : "+price9);
		
	}

}
