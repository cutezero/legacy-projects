package com.cfn;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter vendor name: ");
		String vendor=s.nextLine();
		System.out.println("Enter Car name: ");
		String carName=s.nextLine();
		
		CarFactory factory=FactoryProducer.getCarFactory(vendor);
		Car car= factory.getCar(carName);
		car.drive();

	}

}
