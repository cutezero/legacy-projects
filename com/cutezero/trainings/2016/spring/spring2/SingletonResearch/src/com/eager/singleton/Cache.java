package com.eager.singleton;

public class Cache {

	private static Cache instance= new Cache();
	
	/**
	 * The same static attribute can be instantiated inside a static block 
	 * static{
	 * 	try{
	 * 		instance= new Cache();
	 * 		}catch(){}
	 * }
	 * 
	 */
	
	private Cache(){
		System.out.println("Cache()");
	}
	
	public static synchronized Cache getInstatnce(){
		//Here no need to check the condition, bcz alredy the object instantiated
		return instance;
	}
}
