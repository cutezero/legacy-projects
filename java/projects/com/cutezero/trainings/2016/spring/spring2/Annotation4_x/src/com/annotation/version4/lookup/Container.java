package com.annotation.version4.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Container {

	private RequestHandler handler=null;
	
	public void processRequest(String data){
		handler= lookUpRequesthandler();
		handler.handle(data);
		System.out.println("From Container getting the RequestHandler ...");
	}
	

	/**
	 * This is a method to return the object of RequestHandler and 
	 * Here we are using the Dependency  Lookup-injection-method concept
	 * However incase of Annotation we can go for @Lookup
	 * @return
	 */
	@Lookup
	public RequestHandler lookUpRequesthandler(){
		return null;
	}
}
