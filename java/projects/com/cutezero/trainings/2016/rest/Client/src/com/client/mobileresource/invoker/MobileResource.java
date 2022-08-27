package com.client.mobileresource.invoker;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.client.mobileresource.dto.Mobile;
import com.client.mobileresource.dto.Specification;

public class MobileResource {

	private final String BASE_URI= "http://localhost:8082/CustomContentHandler/api/mobile";
	public Specification addMobile(Mobile mobile) {
		Response response= null;
		Specification specification= null;
		String message= null;
		
		WebTarget target=ClientBuilder.newClient().target(BASE_URI);
		System.out.println(target.getUri().toString());
		response= target.request().post(Entity.xml(mobile));
//		response= target.request().post(Entity.json(mobile));
		
		System.out.println("Response Code : "+response.getStatus());
		if (response.getStatus()== 200) {
			response.bufferEntity();
			specification= response.readEntity(Specification.class);
			message= response.readEntity(String.class);
			System.out.println("Response Message : "+message);
		}
		return specification;
	}
}
