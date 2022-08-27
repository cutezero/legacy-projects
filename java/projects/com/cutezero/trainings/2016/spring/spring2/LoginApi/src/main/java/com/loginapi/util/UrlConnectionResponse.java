package com.loginapi.util;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UrlConnectionResponse {
	public String postToUrl(String jsonString, String url) throws Exception {
		String response = null;
		String contentType = "application/json";
		try {
			HttpClient client = new HttpClient();
			PostMethod postq = new PostMethod(url.trim());
			RequestEntity entity = new StringRequestEntity(jsonString.toString(), contentType, "UTF-8");
			postq.setRequestEntity(entity);
			postq.setRequestHeader("Content-type", contentType + "; charset=UTF-8");
			client.executeMethod(postq);
			response = postq.getResponseBodyAsString();
			System.out.println("Response json: " + response);
		} catch (Exception e) {
			System.out.println("Error in Sending Request: " + e.getMessage());
			throw new Exception("Error in Sending Request : " + e.getMessage());
		}
		return response;
		
	}
	private ResponseDto convertJsonToObject(String postResponse) {
		ObjectMapper objMapper = new ObjectMapper();
		objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		ResponseDto response = null;
		try {
			response = objMapper.readValue(postResponse, ResponseDto.class);
		} catch (Exception e) {
			System.out.println("JsonString not converted to object: " + e.getMessage());
		}
		return response;
	}
}
