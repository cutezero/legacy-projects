package com.app.beans;

public class ChocoTest {

	double maxAmount;
	double pricePerChocolate;
	int noOfWrapper2get1Chocolate;
	
	public static void main(String[] args) {
		
	}
	
	public void countMaxChocolate(){
		//chocolate wrapper puzzle

		int noOfChocolateForFirstTime;
		int noOfChocolate;
		int noOfWrapper;
		int noOfWrapperBunch;
		int noOfNewChocolateForWrapperBunch=0;
		int noOfSpareWrapper;
		int chocolate2Stomach;
		
		noOfChocolateForFirstTime=(int) (maxAmount/pricePerChocolate);
		noOfChocolate=noOfChocolateForFirstTime;
		noOfWrapper=noOfChocolate;
		noOfWrapperBunch=noOfWrapper/noOfWrapper2get1Chocolate;
		noOfSpareWrapper=noOfWrapper%noOfWrapper2get1Chocolate;
		noOfNewChocolateForWrapperBunch=noOfWrapperBunch;
		chocolate2Stomach=noOfChocolateForFirstTime+noOfNewChocolateForWrapperBunch;
		
	}
}
