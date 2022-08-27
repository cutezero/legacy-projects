package com.billdesk.resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.StreamingOutput;

@Path("/visa")
public class BilldeskVisaProvider implements BilldeskProvider{

	@Override
	public StreamingOutput pay(InputStream in) {
		return new StreamingOutput() {
			
			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				StringBuilder builder= new StringBuilder();
				builder.append("<transaction><card-type>visa</card-type><transaction-no>90796377687</transaction-no><status>success</status></transaction>");
				out.write(builder.toString().getBytes());
				out.close();
			}
		};
	}

	
}
