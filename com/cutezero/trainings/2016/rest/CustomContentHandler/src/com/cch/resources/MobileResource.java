package com.cch.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cch.dto.Mobile;
import com.cch.dto.Specification;

@Path("/mobile")
public class MobileResource {

	@POST
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Specification addMobile(Mobile mobile) {
		Specification specification=new Specification();
		specification.setModel(mobile.getModel());
		specification.setBrand(mobile.getBrand());
		specification.setInternalMemoryInGB(32);
		specification.setRamInGB(mobile.getRam());
		specification.setPrice(mobile.getPrice());
		specification.setCameraResolutionInPx(13);
		
		return specification;
	}
}
