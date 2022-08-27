package com.cfn;

public class Dollar20Dispense implements DispenseChain {
	
	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount()>=20){
			int num=cur.getAmount()/20;
			int reminder=cur.getAmount()%20;
			System.out.println("Dispensing "+num+" 20$ notes");
		}
		else
			chain.dispense(cur);		
	}
}
