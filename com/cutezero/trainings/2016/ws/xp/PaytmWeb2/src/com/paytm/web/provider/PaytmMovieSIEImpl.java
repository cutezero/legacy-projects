package com.paytm.web.provider;

import java.rmi.RemoteException;

public class PaytmMovieSIEImpl implements PaytmMovieSIE{

	public String bookMovieTicket(String theater, String movie)
			throws RemoteException {
		String ticketId=null;
		if (theater.equals("Sathyam"))
			ticketId="Sathyam341345";
		else if (theater.equals("Inox"))
			ticketId="Inox8948";
		else if (theater.equals("PVRCinems"))
			ticketId="PVR9848";
		else if (theater.equals("Rukmini"))
			ticketId="BAM89484";
		else
			ticketId="839257985";
			
		return ticketId+movie;
	}

	public String cancelTicket(String ticketNo) throws RemoteException {
		String referenceNo=null;
		if (ticketNo.equals("HYD"))
			referenceNo="Sathyam341345";
		else if (ticketNo.equals("BBSR"))
			referenceNo="Inox8948";
		else if (ticketNo.equals("BAN"))
			referenceNo="PVR9848";
		else if (ticketNo.equals("BAM"))
			referenceNo="BAM89484";
		else
			referenceNo="839257985";
		return referenceNo;
	}

	
}
