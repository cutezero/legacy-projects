package com.cfn;

public class FactoryProducer {
	public static  CarFactory getCarFactory(String vendor){
		if (vendor.equals("Maruti"))
			return new MarutiCarFactory();
		else if (vendor.equals("Honda"))
			return new HondaCarFactory();
		else
			return null;
	}
}
