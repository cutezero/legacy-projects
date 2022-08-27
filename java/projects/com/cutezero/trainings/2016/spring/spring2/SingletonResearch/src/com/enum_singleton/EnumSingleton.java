package com.enum_singleton;



/**
 * In this case we can avoid breaking our Singleton to be loaded as multiple times
 * Enum always are globally accessible and by default they are Singleton
 * But Enum never can be lazily Initialized ( its not flexible as a class)
 * @author Srikanta.ydon
 *
 */

public enum EnumSingleton {

	INSTANCE;
	public static void getInstance(){
		//do Something if you want
	}
	
}
