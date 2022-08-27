package com.exceptionhandling.resource;

import java.util.Date;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.exceptionhandling.dto.AccountDetails;
import com.exceptionhandling.dto.ResponseResult;
import com.exceptionhandling.dto.exception.ErrorResponse;
import com.exceptionhandling.exceptions.InsufficientFundsException;
import com.exceptionhandling.exceptions.InvalidAccountNumberException;
import com.exceptionhandling.exceptions.LimitPolicyException;
import com.exceptionhandling.exceptions.SBIHostServiceException;

@Path("/bank")
public class BankService {

	@PUT
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("/add-cheque/{accountNo}/{chequeType}")
	public Response addChequeFacility(@PathParam("accountNo") String accountNo,
			@PathParam("chequeType") String chequeType) {
		if (accountNo.equals(null) || accountNo.trim().length() == 0) {
			throw new WebApplicationException("Your Account No is not valid", Status.BAD_REQUEST);
		}
		return Response.status(Status.CREATED)
				.entity(new ResponseResult(UUID.randomUUID().toString().substring(1, 8), accountNo, "SUCCESS",
						"your request has been accepted", 5850))
				.cookie(new NewCookie("lastAccessDate", new Date().toString())).build();
	}

	@PUT
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("withdraw/{accountNo}/{amount}")
	public ResponseResult withdrawMoney(@PathParam("accountNo") String accountNo, @PathParam("amount") double amount) {
		ResponseResult result = null;
		ErrorResponse errorResponse = null;

		try {
			if (amount < 1000) {
				Class.forName("com.mysql.jdbc.Driver");
			}
			result = new ResponseResult(UUID.randomUUID().toString(), accountNo, "SUCCESS",
					"Money withdrawn successfully", amount);
		} catch (ClassNotFoundException e) {
			errorResponse = new ErrorResponse("001", "Invalid Input", "amount must greater than 1000");
			throw new WebApplicationException(e, Response.status(Status.BAD_REQUEST).entity(errorResponse).build());
		}
		return result;
	}

	@PUT
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Path("transfer/{toAccount}")
	public ResponseResult transferMoney(AccountDetails fromAccount, @PathParam("toAccount") String toAccount) {
			if(fromAccount.getAccountNo().equals(null) || fromAccount.getAccountNo().length()==0) {
				throw new InvalidAccountNumberException("Invalid Account ");
			}
			if(fromAccount.getBalance()<100) {
				System.out.println("Balance1 : "+fromAccount.getBalance());
				throw new InsufficientFundsException();
			}
			if(fromAccount.getBalance()>50000) {
				System.out.println("Balance2 : "+fromAccount.getBalance());
				throw new LimitPolicyException();
			}
			if(fromAccount.getBalance()>90000) {
				System.out.println("Balance3 : "+fromAccount.getBalance());
				try {
					System.out.println("Balance4 : "+fromAccount.getBalance());
					Class.forName("com.oracle.jdbc.OracleDriver");
				} catch (ClassNotFoundException e) {
					System.out.println("Balance5 : "+fromAccount.getBalance());
				throw new SBIHostServiceException(e);
				}
			}
			
			System.out.println("Balance6 : "+fromAccount.getBalance());
			return new ResponseResult(
					UUID.randomUUID().toString().replaceAll("-", ""),
					fromAccount.getAccountNo(),
					"SUCCES", "Accepted",  fromAccount.getBalance());
	}
}
