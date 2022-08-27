package com.declarative.aspectj.afterreturn.beans;

public class KeyGenerator {

	public int generateKey(int keyLength){
		if(keyLength<=8)
			return 0;
		return 1;
	}
}
