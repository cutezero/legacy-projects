package com.magicbricks.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.UriInfo;

import com.magicbricks.bean.ApartmentCode;
import com.magicbricks.bean.SearchApartmentParams;

@Path("/agent/{loc}")
public class PropertyAgent {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("locate/{pType}/{loc}")
	public String getPropertyDetails(@PathParam("pType") String propertyType, @PathParam("loc") String location) {
		return "<property><type>" + propertyType + "</type><location>" + location + "</location></property>";
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("available")
	public String getAllProperties(@PathParam("loc") String location) {
		return "<property><location>" + location + "</location></property>";
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	// @Path("nearest/{kilometer}.{meter}")
	@Path("nearest/{kilometer}Km{meter}m")
	public String getNearest(@PathParam("kilometer") int kilometer, @PathParam("meter") int meter) {
		return "<property><type>" + kilometer + "</type><location>" + meter + "</location></property>";
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/search/{purpose}") // business, commercial, home, personal, rental
	public String search(@PathParam("loc") String location, @PathParam("purpose") String purpose,
			@MatrixParam("sq-yard") double sqYard, @DefaultValue("25000") @MatrixParam("min-amount") double minAmount,
			@MatrixParam("max-amount") double maxAmount, @QueryParam("landmark") String landmark) {
		return "<search><loc>" + location + "</loc><purpose>" + purpose + "</purpose><sq-yard>" + sqYard
				+ "</sq-yard><min-amount>" + minAmount + "</min-amount><max-amount>" + maxAmount
				+ "</max-amount></search>";
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/enimities")
	// public String getPropertiesByEnemitiesList(@PathParam("loc") String location,
	// @QueryParam("enimities")List<String> enimities) {
	public String getPropertiesByEnemitiesList(@PathParam("loc") String location,
			@MatrixParam("enimities") List<String> enimities) {
		String response = null;
		response = "<properties>";
		for (String enimity : enimities) {
			response += "<enimities>" + enimity + "</enimities>";
		}
		response += "</properties>";
		return response;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/filter1/{pType}/{purpose}")
	public String getPropertiesByFilter(@PathParam("loc") PathSegment locationSegment,
			@PathParam("pType") PathSegment pTypeSegment, @PathParam("purpose") PathSegment purposeSegment) {
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		String locationPart = locationSegment.getPath();
		String pTypePart = pTypeSegment.getPath();
		String purposePart = purposeSegment.getPath();

		MultivaluedMap<String, String> LocationMatrixParameters = locationSegment.getMatrixParameters();
		MultivaluedMap<String, String> pTypeMatrixParameters = pTypeSegment.getMatrixParameters();
		MultivaluedMap<String, String> purposeMatrixParameters = purposeSegment.getMatrixParameters();

		buffer.append("<result>").append("<location>").append(locationPart).append("</location>")
				.append("<location-matrix>").append(getMatrixAsXmlString(LocationMatrixParameters))
				.append("</location-matrix>").append("<pType>").append(pTypePart).append("</pType>")
				.append("<pType-matrix>").append(getMatrixAsXmlString(pTypeMatrixParameters)).append("</pType-matrix>")
				.append("<purpose>").append(purposePart).append("</purpose>").append("<purpose-matrix>")
				.append(getMatrixAsXmlString(purposeMatrixParameters)).append("</purpose-matrix>").append("</result>");

		return buffer.toString();
	}

	private String getMatrixAsXmlString(MultivaluedMap<String, String> matrixParameters) {
		StringBuffer buffer = null;
		List<String> values = null;

		buffer = new StringBuffer();
		values = new ArrayList<>();
		
//		if (matrixParameters != null) {
			for (String key : matrixParameters.keySet()) {
				values = matrixParameters.get(key);
				for (String value : values) {
					buffer.append("Key : ").append(key)
					.append("Value : ").append(value);
				}
			}
//		}
		return buffer.toString();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_XML)
	@Path("add-property")
	public String addProperty(
			@FormParam("propertyName") String propertyName, 
			@FormParam("propertyType") String propertyType, 
			@FormParam("purpose") String purpose, 
			@FormParam("location") String location) {
		return "<add-property><name>"+propertyName+"</name><type>"+propertyType+"</type><purpose>"+purpose+"</purpose><location>"+location+"</location></add-property>";
	}

	@DELETE
//	@Produces("application/xml")
	@Produces(MediaType.APPLICATION_XML)
	@Path("/unlist/{propertyNo}")
	public String unlistProperty(
			@PathParam("propertyNo") String propertyNo, 
			@HeaderParam("agent-no") String agentNo) {
		return "<unlist><propertyNo>"+propertyNo+"</propertyNo><agent-no>"+agentNo+"</agent-no></unlist>";
	}
	
	@GET
	@Produces("application/xml")
	@Path("/get-last-access")
	public String getLastAcessDetails(@CookieParam("lastAccess") String lastAccess) {
		return "<last-access>"+lastAccess+"</last-access>";
	}
	
	@GET
	@Produces("text/plain")
	@Path("/find/{propertyType}")
	public String findProperties(@Context UriInfo uriInfo) {
		MultivaluedMap<String, String> queryParams= null;
		MultivaluedMap<String, String> matrixParams= null;
		List<PathSegment> pathSegments= null;
		StringBuffer buffer= null;
		
		queryParams= uriInfo.getQueryParameters();
		buffer= new StringBuffer();
		buffer.append("Find : ").append("\n")
		.append("\t").append("Query Params : ").append("\n");
		
		for(String key : queryParams.keySet()) {
			buffer.append("\t\t").append(key).append(" : ").append(queryParams.getFirst(key)).append("\n");
		}
		
		buffer.append("\t").append("Matrix Paraams : ").append("\n");
		pathSegments= uriInfo.getPathSegments();
		for(PathSegment segment: pathSegments) {
			buffer.append("\t\t").append(segment.getPath()).append(" : ").append("\n");
			matrixParams= segment.getMatrixParameters();
			for(String key : matrixParams.keySet()) {
				buffer.append("\t\t\t").append(key).append(" : ").append(matrixParams.getFirst(key)).append("\n");
			}
		}
		return buffer.toString();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/bean-param/{area}")
	public String searchApartments(@BeanParam SearchApartmentParams params) {
		return params.toString();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/apartment-code/{code}")
	public String getApartmentCode(@PathParam("code") ApartmentCode code) {
		return "<apartment><catagory>"+code.getCategory()+"</catagory><id>"+code.getApartmentNo()+"</id></apartment>";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/apartment-query/{codec}")
	public String getApartmentCode2(@QueryParam("code") ApartmentCode code) {
		return "<apartment><catagory>"+code.getCategory()+"</catagory><id>"+code.getApartmentNo()+"</id></apartment>";
	}
	
	
	
}

