package com.app.beans;

import java.util.Scanner;

public class ChocoTest3 {

	private static int totalchoco = 0;

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
//		String response;
//		do{
			
		System.out.println("Please Enter totalMoney you have : ");
		int totalMoney=Integer.parseInt(scanner.nextLine());
		System.out.println("Please Enter price of Each Chocolate : ");
		int pricePerChocolate=Integer.parseInt(scanner.nextLine());
		System.out.println("Please Enter number of wrappers which can be returned to get a Chocolate : ");
		int noOfWrappersPerChocolate=Integer.parseInt(scanner.nextLine());
		chocolate(totalMoney, pricePerChocolate, noOfWrappersPerChocolate);
		System.out.println("You can get total chocolates : "+totalchoco);
//		System.out.println("Do you want to calculate again with another number? Press yes(y) or no : ");
//		response=scanner.next();
//		}while(response.trim().toUpperCase()=="YES");
		scanner.close();
	}

	public static void chocolate(int totalMoney, int pricePerChocolate, int noOfWrappersPerChocolate) {
		int spareChocolates=totalMoney % pricePerChocolate;
		int noOfChocolatesForFirstTime = totalMoney / pricePerChocolate;
		totalchoco = noOfChocolatesForFirstTime;
		wrapchoco(noOfChocolatesForFirstTime, noOfWrappersPerChocolate, spareChocolates);

	}

	/**
	 * The following is an example of this programmatic question
	 * 
	 * Rs.100 is the totalMoney, Rs.5 is the price of a chocolate , for 2 wrappers you can get 1 chocolate
	 * so find out total number of chocolates.
	 * 100/5=20 no of chocolate for 1st time
	 * 20/2=10 no of chocolate for 2nd time
	 * 10/2=5 no of chocolates for 3rd time
	 * 5/2=2 no of chocolates for next time with 1 no of spare wrapper
	 * 2/2=1 chocolate I will get for this time and still 1 spare wrapper with me
	 * 1 last chocolate +1 spare wrapper = 2 wrapper for which I can get 1 chocolate for last time
	 * total 20+10+5+2+1+1=39 no of total chocolates I can eat
	 * 
	 */
	
	
	public static void wrapchoco(int noOfChocolatesFrom2ndTime, int noOfWrappersPerChocolate, int spareChocolates) {
		int x = noOfChocolatesFrom2ndTime;
		int r = spareChocolates;
		while (x >= noOfWrappersPerChocolate) {
			x = (x + r) / noOfWrappersPerChocolate;
			r = (x + r) % noOfWrappersPerChocolate;
			totalchoco = totalchoco + x;
		}
	}
}
