package com.annotation.version4.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RequestHandler {

	public void handle(String data){
		System.out.println("Handling the request "+data+"Object Ref : "+this.hashCode());
	}
}
