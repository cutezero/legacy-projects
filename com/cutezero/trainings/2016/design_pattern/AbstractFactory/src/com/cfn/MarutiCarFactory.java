package com.cfn;

public class MarutiCarFactory implements CarFactory {

	@Override
	public Car getCar(String carName) {
		if (carName.equals("Swift"))
			return new Swift();
		else if (carName.equals("Dzire"))
			return new Dzire();
		else
			return null;
	}

}
