package com.exceptionhandling.providers.exceptionmappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.exceptionhandling.dto.exception.ErrorResponse;
import com.exceptionhandling.exceptions.InvalidAccountNumberException;

@Provider
public class InvalidAccountNumberExceptionMapper implements ExceptionMapper<InvalidAccountNumberException>{

	@Override
	public Response toResponse(InvalidAccountNumberException e) {
		return Response.status(Status.BAD_REQUEST).entity(new ErrorResponse("001", "Invalid Data", e.getMessage())).build();
	}

	
}
