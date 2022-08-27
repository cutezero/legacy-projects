package com.lazy.singleton;

public class Car {

	private static Car instance;
	
	private Car(){}
	
	/**
	 * Its the standard way of making a class as singleton
	 * @return
	 */
	public static Car getInstance(){
		if ( instance== null)
			instance= new Car();
		return instance;
	}
}
