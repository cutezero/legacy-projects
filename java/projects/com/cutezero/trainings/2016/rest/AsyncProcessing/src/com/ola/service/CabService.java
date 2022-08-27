package com.ola.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("ola")
public class CabService {

	/**
	 * return type always be void because it never returns anything to it's callee
	 * 
	 * @param source
	 * @param destination
	 * @param asyncResponse
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("request-cab/{source}/{destination}")
	public void requestCab(@PathParam("source") String source, @PathParam("destination") String destination, @Suspended AsyncResponse asyncResponse) {
		new Thread() {

			@Override
			public void run() {
				Response response=Response.ok().entity(source+" to "+ destination+ " Success.").build();
				asyncResponse.resume(response);
			}
			
		}.start();
	}
}
