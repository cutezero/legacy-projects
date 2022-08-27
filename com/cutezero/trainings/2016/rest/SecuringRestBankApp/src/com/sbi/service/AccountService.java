package com.sbi.service;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.sbi.dto.Account;

@Path("account")
public class AccountService {

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Path("get-account/{accountNo}")
	public Account getAccountDetails(@PathParam("accountNo") String accountNo) {
		Account account= null;
		
		account=new Account(accountNo, "SRIKANTA", "AMEERPET", "SAVING", 4569.90);
//		return Response.ok().entity(account).build();	//for returning Response
		return account;
	}

	@PUT
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
	@Path("update-mobile/{accountNo}/{mobileNo}")
	public String getAccountDetails(@PathParam("accountNo") String accountNo, @PathParam("mobileNo") String mobileNo,@Context SecurityContext sc) {
//		Account account= null;
		String message= null;
		if(sc.isUserInRole("user")) {
			throw new SecurityException("You are not authorized ");
		}
		message= "Your account : "+accountNo+" has updated with new mobile no : "+mobileNo;
		return message;
	}
}
