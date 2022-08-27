package com.train.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/erail/{username}")
public class InjectionTrainStatus {

	@PathParam("username")
	private String username;
	
	@Path("/betweenstation/{fromStation}/{toStation}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTrainsAvailability(@PathParam("fromStation")String fromStation, @PathParam("toStation")String toStation) {
		String response= null;
		
		response= fromStation+ " : "+toStation;
		return response;
	}
	
	@Path("/{trainNo:\\d+}/seats")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String seatAvailability(@PathParam("trainNo")int trainNo) {
		return "<train>"+trainNo+"</train>";
	}
}
