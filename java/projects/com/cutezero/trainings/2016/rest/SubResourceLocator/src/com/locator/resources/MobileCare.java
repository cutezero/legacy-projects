package com.locator.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class MobileCare {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/repair/{jobNo}")
	public String getRepairStatus(@PathParam("jobNo")String jobNo) {
		return "Repair is under progress : "+jobNo+" hash code is : "+this.hashCode();
	}
}
