package com.bill_pugh_singleton;

public class Bus {

	private Bus(){}

	/**
	 * We can make a singleton thread-safe without synchronized keyword 
	 * and we can optimize a lot of performance out of it.
	 * 
	 * This is the most amazing singleton in the singleton concept without a synchronized keyword
	 * @return
	 */
	private static class BusHelper{
		//declare a final variable it can't be changed
		private static final Bus instance= new Bus();
	}

	public static Bus getInstance() {
		return BusHelper.instance;
	}

}
