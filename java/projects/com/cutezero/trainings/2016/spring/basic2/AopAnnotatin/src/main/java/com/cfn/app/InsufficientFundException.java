package com.cfn.app;

public class InsufficientFundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundException (String message){

	super(message);
	}
}
