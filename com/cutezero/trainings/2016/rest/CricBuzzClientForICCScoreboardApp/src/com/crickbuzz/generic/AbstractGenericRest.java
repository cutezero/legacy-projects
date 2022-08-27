package com.crickbuzz.generic;

import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

public abstract class AbstractGenericRest {

	public Response sendRequest(String completeUri, Map<String, String> pathParams, Map<String, String> queryParams, MultivaluedMap<String, String> headers, List<NewCookie> cookies, Object entity,
			String mediaType, String httpMethodType) {
		Builder invocationBuilder = null;
		WebTarget target= null;
		Response response= null;
		
		target=ClientBuilder.newClient().target(completeUri);
		
		//add path params
		if(pathParams!= null && pathParams.size()>0) {
		for(String pathParam : pathParams.keySet()) {
				target= target.resolveTemplate(pathParam, pathParams.get(pathParam));
			}
		}
		
		//add query params
		if(queryParams!= null && queryParams.size()>0) {
			for(String queryParam : queryParams.keySet()) {
				target= target.queryParam(queryParam, queryParams.get(queryParam));
			}
		}
		
		//Build the Invocation Builder
		switch (mediaType) {
		case MediaType.TEXT_PLAIN:
			invocationBuilder = target.request(MediaType.TEXT_PLAIN);
			break;
		case MediaType.APPLICATION_JSON:
			invocationBuilder = target.request(MediaType.APPLICATION_JSON);
			break;
		case MediaType.APPLICATION_XML:
			invocationBuilder = target.request(MediaType.APPLICATION_XML);
			break;

		default:
			invocationBuilder = target.request();
			break;
		}

		System.out.println("URI : "+target.getUri().toString());
		//add all headerParams
		if (headers != null && headers.size() > 0) {
			for (String headerKey : headers.keySet()) {
				invocationBuilder = invocationBuilder.header(headerKey, headers.get(headerKey));
			}
		}
		
		//add all CookieParams
		if (cookies != null && cookies.size() > 0) {
			for (Cookie cookie : cookies) {
				invocationBuilder = invocationBuilder.cookie(cookie);
			}
		}
		
		switch (httpMethodType) {
		case "GET":
			response=invocationBuilder.get();
			break;
			
		case "POST":
			if (entity!= null) {
				response=invocationBuilder.post(Entity.xml(entity));
			}
			break;
			
		case "PUT":
			if (entity!= null) {
				response=invocationBuilder.put(Entity.xml(entity));
			}
			break;
			
		case "DELETE":
				response=invocationBuilder.delete();
			break;
			
		default:
			throw new WebApplicationException(" Invalid Input request");
//			break;
		}
		
		System.out.println("Response code from generic : "+response.getStatus());
		return response;
	}
}
