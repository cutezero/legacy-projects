package com.soumya.test1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int sum=0;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first digit : ");
		a=s.nextInt();
		System.out.println("Enter 2nd digit : ");
		b=s.nextInt();
		
		System.out.println("User Input values : "+a+" "+b);
		System.out.println("------FIBONACCI-----------------");
		for(int i=0; i<10;i++){
			sum= a+b;
			a=b;
			b=sum;
			System.out.println(" "+sum);
		}
	}

}
