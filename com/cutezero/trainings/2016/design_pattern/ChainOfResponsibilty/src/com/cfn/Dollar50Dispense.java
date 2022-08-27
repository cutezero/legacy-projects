package com.cfn;

public class Dollar50Dispense implements DispenseChain {
	
	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount()>=50){
			int num=cur.getAmount()/50;
			int reminder=cur.getAmount()%50;
			System.out.println("Dispensing "+num+" 50$ notes");
		}
		else
			chain.dispense(cur);		
	}
}
