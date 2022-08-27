package com.exceptionhandling.exceptions;

public class LimitPolicyException extends SBIHostServiceException{

	/**
	 * Any daily limitation amount comes under this category
	 */
	
	
	public LimitPolicyException() {
		// TODO Auto-generated constructor stub
	}

	public LimitPolicyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public LimitPolicyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public LimitPolicyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public LimitPolicyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
