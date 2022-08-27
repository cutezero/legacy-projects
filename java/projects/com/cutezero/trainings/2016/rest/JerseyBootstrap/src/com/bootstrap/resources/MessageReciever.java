package com.bootstrap.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("msg")
public class MessageReciever {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(@QueryParam("sender-id")String senderId) {
		System.out.println("Hash code : "+this.hashCode());
		return senderId+" Received";
	}
}
