package com.locator.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

public class AccessoriesCare {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String accssoriesStatus(@QueryParam("type")String type) {
		return "type : "+type + " Hash : "+hashCode();
	}
}
