package com.cfn.app;

import javax.xml.ws.Endpoint;

public class Publish {

	public static void main(String[] args) {
		String address="http://localhost:8989/sample";
		MessageSample implementor= new MessageSample();
		Endpoint.publish(address, implementor);
		System.out.println("Done bro");
	}
}
