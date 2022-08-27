package com.cfn;

public class Dollar10Dispense implements DispenseChain {
	
	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount()>=10){
			int num=cur.getAmount()/10;
			System.out.println("Dispensing "+num+" 10$ notes");
		}
	}
}
