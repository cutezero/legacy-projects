package com.declarative.aspectj.throwing.beans;

public class Thrower {

	public int iAmThrowing(int i){
		if(i<=0)
			throw new IllegalArgumentException("value of i is invalid");
		return i;
	}
}
