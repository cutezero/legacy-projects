package com.fm.beans;

public class SingletonValidator {

	private static SingletonValidator instance;
	private SingletonValidator(){}
	
	public static synchronized SingletonValidator getInstance(){
		if(instance==null){
			instance=new SingletonValidator();
		}
		return instance;
	}
	
	public String validate(){
		return "Validated";
	}
}
