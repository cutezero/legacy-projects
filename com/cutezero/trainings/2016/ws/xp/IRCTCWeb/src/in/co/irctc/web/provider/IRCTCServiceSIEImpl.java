package in.co.irctc.web.provider;

import java.rmi.RemoteException;

public class IRCTCServiceSIEImpl implements IRCTCServiceSIE{

	public Ticket bootTicket(JourneyInfo journeyInfo,
			PassengerInfo passengerInfo) throws RemoteException {
		System.out.println("journeyInfo :"+journeyInfo+ "passengerInfo : "+passengerInfo);
		Ticket ticket=null;
		ticket= new Ticket();
		ticket.setPnr(952845856);
		ticket.setTrainNumber(12145);
		ticket.setSeatNo("S3_45U");
		
		return ticket;
	}

	public double getTicketPrice(JourneyInfo journeyInfo)
			throws RemoteException {
		double ticketPrice=0;
		System.out.println("journeyInfo :"+journeyInfo);
		if (journeyInfo.getSource().equals("BAM"))
			ticketPrice=550.00;
		else if (journeyInfo.getSource().equals("SCB"))
			ticketPrice=750.00;
		else if (journeyInfo.getSource().equals("LTT"))
			ticketPrice=1750.00;
		else
			return ticketPrice=30000;
		return ticketPrice;
	}
	
}
