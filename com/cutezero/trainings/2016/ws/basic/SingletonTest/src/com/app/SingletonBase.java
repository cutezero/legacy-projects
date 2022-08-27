package com.app;

public class SingletonBase {

	private static SingletonBase instance;
	private SingletonBase(){
		
	}
	public static SingletonBase getInstance(){
		if (instance==null){
			instance=new SingletonBase();
		}
		return instance;
	}
}
