package com.inject.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/account/{accountNo:\\d+}/{ifscCode}")
public class NetBanking extends AbstractAccount{

//	@PathParam("accountNo")
	private int accountNo;
	
//	@PathParam("ifscCode")
	private String ifscCode;

	/**
	 * @param accountNo
	 */
	public NetBanking(@PathParam("accountNo")int accountNo) {
		super();
		this.accountNo = accountNo;
		System.out.println("AC No1 : "+accountNo);
		System.out.println(" IFSC CODE : "+ifscCode);
	}
	

	@GET
	@Produces("text/plain")
	@Path("/balance")
	public double getBalance() {
		System.out.println("AC No2 : "+accountNo);
		System.out.println(" IFSC CODE2 : "+ifscCode);
		return accountNo;
	}
	
	@GET
	@Produces("application/xml")
	@Path("/payees")
	public String getPayees() {
		return "<payees><payee>John Carter : "+accountNo+" </payee></payees>" ;
	}
}
