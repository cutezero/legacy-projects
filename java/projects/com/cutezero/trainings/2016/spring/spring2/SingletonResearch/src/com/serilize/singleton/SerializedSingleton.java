package com.serilize.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	/**
	 * Added generated serialVersioin 
	 */
	private static final long serialVersionUID = -5298656301601647838L;

	private SerializedSingleton(){
		//intentionally blank for singleton
	}
	private static class SerilizedSingletonHelper{
		private static final SerializedSingleton instance= new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance(){
		return SerilizedSingletonHelper.instance;
	}
	
	/**
	 * For SerializedSingletonTest - to overcome serialized-singleton problem
	 * It will solve the issue of serialized-singleton object and make it singleton while de-serializing also
	 */
	protected Object readResolve(){
		
		return getInstance();
	}
}

