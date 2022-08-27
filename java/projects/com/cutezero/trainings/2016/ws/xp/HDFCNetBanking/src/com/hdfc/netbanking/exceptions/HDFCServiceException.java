package com.hdfc.netbanking.exceptions;

public class HDFCServiceException extends Throwable{

	private Throwable throwable;

	public HDFCServiceException(Throwable throwable) {
		super();
		this.throwable = throwable;
	}

	public HDFCServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HDFCServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public HDFCServiceException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
}
