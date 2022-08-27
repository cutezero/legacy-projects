package com.annotation.aspectj.config.beans;

import java.nio.file.AccessDeniedException;

import org.springframework.stereotype.Component;

@Component
public class Thrower {

	public int isThrowing(int i) throws AccessDeniedException{
		switch (i) {
		case 0:
			throw new IllegalArgumentException("Invalid  value of i");
//			break;
		case 1:
			throw new ArrayIndexOutOfBoundsException("out of bound");
		case 2:
			throw new ArithmeticException("--ArithmeticException--");
		case 3:
			throw new AccessDeniedException("access denied");
		default:
			return i;
//			break;
		}
	}
}
