package com.cfn;

public class HondaCarFactory implements CarFactory {

	@Override
	public Car getCar(String carName) {
		if (carName.equals("Brio"))
			return new Brio();
		else if (carName.equals("City"))
			return new City();
		else
		return null;
	}

}
