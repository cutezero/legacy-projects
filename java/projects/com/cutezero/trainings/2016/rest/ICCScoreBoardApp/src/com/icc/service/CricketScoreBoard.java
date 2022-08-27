package com.icc.service;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("cricket")
public class CricketScoreBoard {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
	@Path("/score/{matchId}/{innings}")
	public int getCurrentScore(@PathParam("matchId") String matchId, @PathParam("innings") int innings) {
		return new Random().nextInt(800);
	}
}
