package com.app.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.app.model.CustomDate;

@Path("/product")
public class ProductDetails {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/date/{data}")
	public String getUploadedDate(@PathParam("data")CustomDate customDate) {
		return customDate.toString();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/a")
	public String getTest() {
		return "Oh I am the Guy";
	}
	
}
