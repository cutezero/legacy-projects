package com.irctc.web.provider;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRCTCTicket extends Remote{

	long bookTicket(JourneyInfo journeyInfo, PassengerInfo passengerInfo) throws RemoteException;
	Ticket getTicketForBooking(JourneyInfo journeyInfo, PassengerInfo passengerInfo)throws RemoteException;
}
