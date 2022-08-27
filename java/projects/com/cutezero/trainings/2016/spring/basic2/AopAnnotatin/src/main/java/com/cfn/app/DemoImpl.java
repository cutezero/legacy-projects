package com.cfn.app;

import org.springframework.stereotype.Service;

@Service
public class DemoImpl implements Demo {

	public void m1(int amount) throws Exception {
		// TODO Auto-generated method stub
		if(amount<=0){
			throw new InsufficientFundException("Idiot, this is invalid amount: "+amount);
		}else{
			System.out.println("Valid amount: "+amount);
		}
	}

	public void m2() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
