package com.exceptionhandling.providers.exceptionmappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.exceptionhandling.dto.exception.ErrorResponse;
import com.exceptionhandling.exceptions.InsufficientFundsException;

@Provider
public class InsufficientFundsExceptionMapper implements ExceptionMapper<InsufficientFundsException>{

	@Override
	public Response toResponse(InsufficientFundsException e) {
		return Response.status(Status.BAD_REQUEST).entity(new ErrorResponse("002", "Insufficient Funds ", e.getMessage())).build();

	}

	
}
