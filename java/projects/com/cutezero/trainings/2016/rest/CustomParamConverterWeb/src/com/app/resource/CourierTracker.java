package com.app.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.app.bean.AwbNo;

@Path("/courier")
public class CourierTracker {

	@GET
	@Produces("text/plain")
	@Path("/track/{awb-no}")
	public String getStatus(@PathParam("awb-no")AwbNo awbNo) {
		return "AWB NO : "+awbNo.getDestination()+""+awbNo.getZipCode();
	}
}
