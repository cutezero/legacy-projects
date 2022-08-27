package com.resteasy.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/merchant")
public class Merchant {

	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMerchantName(@QueryParam("merchant-code")String merchantCode) {
		return "Code : "+merchantCode+" Name : WS Retail from FLIPKART";
	}
	*/
	@GET
	
	@Produces(MediaType.TEXT_PLAIN)
	public String getHeroName(@QueryParam("name") String hero) {
		return "hello "+hero;
	}
}
