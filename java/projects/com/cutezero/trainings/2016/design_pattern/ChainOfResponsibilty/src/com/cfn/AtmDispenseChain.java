package com.cfn;

import java.util.Scanner;

public class AtmDispenseChain {
	private DispenseChain c1;
	public AtmDispenseChain(){
		//initiate the chain
		this.c1=new Dollar50Dispense();
		DispenseChain c2=new Dollar20Dispense();
		DispenseChain c3=new Dollar10Dispense();
		//set chain of responsibility
		c1.setNextChain(c2);
		c1.setNextChain(c3);
	}
	public static void main(String[] args) {
		AtmDispenseChain atm= new AtmDispenseChain();
		Scanner s=new Scanner(System.in);
		//create an infinite loop
		while(true){
			int amt=0;
			System.out.println("Enter amount to dispense");
			amt=s.nextInt();
			if(amt%10!=0){
				System.out.println("Amount must be in 10's");
				return;
			}
			//process the request
			atm.c1.dispense(new Currency(amt));
		}
	}
}
