package com.inject.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("loan/{loanNo}")
public class LoanAgent {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	
	public String loanDetails(@PathParam("loanNo") String loanNo) {
		return loanNo;
	}
}
