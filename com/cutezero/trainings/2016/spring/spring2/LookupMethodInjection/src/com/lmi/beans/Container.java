package com.lmi.beans;

public abstract class Container {

	protected String data;
	
	public void setData(String data) {
		this.data = data;
	}
	public void receive(){
		RequestHandler handler=lookupRequestHandler();
		handler.handle(data);
		System.out.println("Hash codes are from Container's receive() : "+this.hashCode());
	}
	abstract public RequestHandler lookupRequestHandler();
		
}
