package com.annotation.aspectj.config.beans;

import org.springframework.stereotype.Component;

@Component
public class KeyGenerator {

	public int generateKey(int keyLen){
		if(keyLen<=8)
			return 0;
		return 1;
	}
}
