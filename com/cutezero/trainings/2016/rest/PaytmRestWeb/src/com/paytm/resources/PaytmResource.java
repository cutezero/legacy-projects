package com.paytm.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class PaytmResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public double getBalance(@QueryParam("mobile") String mobile) {
		System.out.println("Mobile : " + mobile);
		if (mobile.equals("8895749052"))
			return 123.45;
		return 543.45;
	}
}
