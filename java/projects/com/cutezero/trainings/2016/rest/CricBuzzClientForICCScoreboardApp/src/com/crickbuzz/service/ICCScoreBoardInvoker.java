package com.crickbuzz.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.crickbuzz.generic.AbstractGenericRest;

public class ICCScoreBoardInvoker extends AbstractGenericRest{

	protected String matchId;
	protected int inningNo;
	
	
	public ICCScoreBoardInvoker(String matchId, int inningNo) {
		//set this if you want the score for same match and same innings for repeatedly
		this.matchId = matchId;
		this.inningNo = inningNo;
	}
	private final String ICC_SCORE_BASE_URI= "http://localhost:8081/ICCScoreBoardApp/icc/cricket/score";
	
//	public int getCurrentScore(String matchId, int inningNo) {
	public int getCurrentScore() {
		Response response= null;
		WebTarget target= null;
		Invocation.Builder invocationBuilder= null;
		Invocation invocation= null;
		int score=0;
		
		target=ClientBuilder.newClient().target(ICC_SCORE_BASE_URI).path(matchId).path(String.valueOf(inningNo));
		invocationBuilder=target.request(MediaType.TEXT_PLAIN);
		
		invocation=invocationBuilder.buildGet();
		response=invocation.invoke();
		System.out.println("Response code : "+response.getStatus());
		if(response.getStatus()==200) {
			response.bufferEntity();
			score= response.readEntity(Integer.class);
		}
		return score;
	}
	
	public int getCurrentScore2() {
		String completeUri= null;
		Map<String, String> pathParams= null;
		String mediaType= null;
		String httpMethodType= null;
		int score=0;
		
		completeUri=ICC_SCORE_BASE_URI+"/"+"matchId"+"/"+String.valueOf(inningNo);
		pathParams= new HashMap<>();
		pathParams.put("matchId", matchId);
		pathParams.put("inningNo", String.valueOf(inningNo));
		
		mediaType= MediaType.TEXT_PLAIN;
		httpMethodType="GET";
		
		Response response=sendRequest(completeUri, pathParams, null, null, null, null, mediaType, httpMethodType);
		
		System.out.println("Response code : "+response.getStatus());
		if(response.getStatus()==200) {
			response.bufferEntity();
			score= response.readEntity(Integer.class);
		}
		return score;

	}
}
