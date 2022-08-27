package com.client.magicbrick.invoker;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Magicbrick {

	private final String MAGICBRICKS_BASE_URI = "http://localhost:8081/MagicsbrickInjection3/rest/agent/{loc}";

	public String search(String location, String purpose, double sqYard, double minAmount, double maxAmount,
			String landmark) {
		Client client = null;
		WebTarget target=null;
		Invocation.Builder invocationBuilder= null;
		Response response = null;
		String message= null;

		client = ClientBuilder.newClient();
		//Now add URI, Path/Matrix/Query Params
		target=client.target(MAGICBRICKS_BASE_URI).resolveTemplate("loc", location).matrixParam("sq-yard", sqYard)
				.path("search").path(purpose).matrixParam("min-amount", minAmount).matrixParam("max-amount", maxAmount)
				.queryParam("landmark", landmark);
		
		//create Invocation.Builder (its like InvocationBuilder with builder design pattern)
		invocationBuilder= target.request();
		System.out.println(target.getUri().toString());
		//Now we can add Header/Cookie Params; but we wdon't have any 
		response=invocationBuilder.accept(MediaType.APPLICATION_XML).get();
		
		System.out.println("Response code : "+response.getStatus());
		if(response.getStatus()==200) {
			response.bufferEntity();		//store in response as the stream will be closed for first readEntity()
			message=response.readEntity(String.class);
		}
		return message;
	}
	
	public String addProperty(String propertyName, String propertyType, String purpose, String location) {
		Form formData= null;
		Response response= null;
		String message= null;
		
		formData=new Form();
		formData=formData.param("propertyName", propertyName)
				.param("propertyType", propertyType)
				.param("purpose", purpose)
				.param("location", location);
		
		response=ClientBuilder.newClient().target(MAGICBRICKS_BASE_URI).path("add-property")
		.request().post(Entity.form(formData));
		
		System.out.println("Response Code : "+response.getStatus());
		if(response.getStatus()== 200) {
			response.bufferEntity();
			message= response.readEntity(String.class);
		}
		return message;
	}
	
	public String unlistProperty(String location, String propertyNo, String agentNo) {
		
		Response response= null;
		String message= null;
		
		response=ClientBuilder.newClient().target(MAGICBRICKS_BASE_URI)
		.path("unlist").path("{propertyNo}").resolveTemplate("propertyNo", propertyNo)
		.request().header("agent-no", agentNo).delete();
		
		if(response.getStatus()==200) {
			response.bufferEntity();
			message=response.readEntity(String.class);
		}
		return message;
	}
	
	public String getLastAcessDetails(String lastAccess) {
		
		Response response=null;
		String message= null;
		
		response=ClientBuilder.newClient().target(MAGICBRICKS_BASE_URI).path("get-last-access")
		.request().cookie("lastAccess", lastAccess).get();
		
		if(response.getStatus()==200) {
			response.bufferEntity();	
			message= response.readEntity(String.class);
		}
		return message;
	}
	
	
}
