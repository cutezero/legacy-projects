package in.co.irctc.web.provider;

import in.co.irctc.web.provider.pojo.JourneyInfo;
import in.co.irctc.web.provider.pojo.PassengerInfo;
import in.co.irctc.web.provider.pojo.Ticket;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRCTCServiceSIE extends Remote{

	Ticket bootTicket(JourneyInfo journeyInfo, PassengerInfo passengerInfo) throws RemoteException;
	double getTicketPrice(JourneyInfo journeyInfo) throws RemoteException;
}
