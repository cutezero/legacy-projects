package com.client.invoker;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class MerchantInvoker {

	public String getMerchantName(String merchantCode) {
		final String BASE_URI= "http://localhost:8081/ResteasyBootstrap/api";
		ClientBuilder builder= null;
		Client client= null;
		WebTarget target= null;
		Response response=null;
		int statusCode;
		
		
		builder= ClientBuilder.newBuilder();	//creates the empty ClientBuilder object
		//builder.property("connection.timeout", 360000);
//		builder.register(JaxBReader.class)	//register Provider classes
		client=builder.build();	 //creates the client object with all the input
		target= client.target(BASE_URI);
		WebTarget merchantTarget=target.path("merchant");
		merchantTarget= merchantTarget.queryParam("name",merchantCode);
		response= merchantTarget.request().get();
		String responseString=response.readEntity(String.class);
			
			return responseString;
		
	}
}
