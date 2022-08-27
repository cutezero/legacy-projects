package com.sbi.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sbi.dto.Account;

@Path("account")
public class AccountService {

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("get-account/{accountNo}")
	public Account getAccountDetails(String accountNo) {
		Account account= null;
		
		account=new Account(accountNo, "SRIKANTA", "AMEERPET", "SAVING", 4569.90);
		
		return account;
		
	}
}
