package com.exceptionhandling.providers.exceptionmappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.exceptionhandling.dto.exception.ErrorResponse;
import com.exceptionhandling.exceptions.LimitPolicyException;

@Provider
public class LimitPolicyExceptionMapper implements ExceptionMapper<LimitPolicyException>{

	@Override
	public Response toResponse(LimitPolicyException e) {
		return Response.status(Status.BAD_REQUEST).entity(new ErrorResponse("003", "Limits Exceeded ", e.getMessage())).build();
	}

	
}
