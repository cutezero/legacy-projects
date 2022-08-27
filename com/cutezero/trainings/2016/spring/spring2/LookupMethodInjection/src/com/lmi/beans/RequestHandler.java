package com.lmi.beans;

public class RequestHandler {

	public void handle(String data){
		System.out.println("Handling the request request : "+data);
		System.out.println("Hash codes are from Request Handler's handle() : "+this.hashCode());
	}
}
