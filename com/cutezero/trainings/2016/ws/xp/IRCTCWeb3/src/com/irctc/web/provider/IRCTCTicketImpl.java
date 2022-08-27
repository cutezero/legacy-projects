package com.irctc.web.provider;

import java.rmi.RemoteException;

public class IRCTCTicketImpl implements IRCTCTicket {

	public String getOffer(String city) throws RemoteException {
		String offer=null;
		if (city.equals("BAM"))
			offer="BAM Offer";
		else if (city.equals("BBSR"))
			offer="BBSR Offer";
		else if (city.equals("HYD"))
			offer="HYD Offer";
		else if (city.equals("DEL"))
			offer="DEL Offer";
		else
			offer="INDIA Offer";
		System.out.println(city);
		return offer;
	}

	public long bookTicket(JourneyInfo journeyInfo, PassengerInfo passengerInfo)
			throws RemoteException {
		long pnr= 0;
		if (journeyInfo.getSource().equalsIgnoreCase("BAM"))
			pnr=587989;
		else if (journeyInfo.getSource().equalsIgnoreCase("DEL"))
			pnr=7756567;
		else if (journeyInfo.getSource().equalsIgnoreCase("HYD"))
			pnr=88789;
		else if (journeyInfo.getSource().equalsIgnoreCase("BBSR"))
			pnr=9023;
		else
			pnr=1245429;
			
		System.out.println("JoutneyInfo : "+journeyInfo+" Passenger Info : "+passengerInfo );
		return pnr;
	}

	public Ticket getTicketForPnr(long pnr) throws RemoteException {
		Ticket ticket=new Ticket();
		ticket.setPnr(pnr);
		ticket.setSeatNo("S956");
		ticket.setTrainNumber(12109);
		System.out.println("Ticket : "+ticket);
		return ticket;
	}

	public Ticket getTicketForBooking(JourneyInfo journeyInfo,
			PassengerInfo passengerInfo) throws RemoteException {
		Ticket ticket=new Ticket();
		ticket.setPnr(67483);
		ticket.setSeatNo("S956");
		ticket.setTrainNumber(12109);
		System.out.println("Ticket 2: "+ticket);
		return ticket;
	}

}
