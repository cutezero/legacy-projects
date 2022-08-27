package com.sr.resources;

import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sr.dto.Account;
import com.sr.dto.Application;

@Path("/sbi")
public class BankAccountManager {

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@Path("/apply")
	public Response applyNewAccount(Application application) {
		Account account= null;
		ResponseBuilder builder= null;
		
		account= new Account();
		account.setAccountNo(UUID.randomUUID().toString().substring(1, 11));
		account.setAccountHolderName(application.getApplicantName());
		account.setAcountType(application.getAccountType());
		account.setBalance(application.getMinBalance());
		
		builder= Response.status(201).entity(account).header("token", "TK9090").cookie(new NewCookie("OTP", "8909"));
		return builder.build();
	}
}
