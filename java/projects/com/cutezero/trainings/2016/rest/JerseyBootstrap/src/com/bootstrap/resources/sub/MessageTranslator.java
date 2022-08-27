package com.bootstrap.resources.sub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/translator")
public class MessageTranslator {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String translate(@QueryParam("msg")String msg) {
		System.out.println(" translate()-Hash code :"+this.hashCode());
		return msg+" Translated ";
	}
}
