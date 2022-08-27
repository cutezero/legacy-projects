package com.irctc.partner.dp;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRCTCServiceSIE extends Remote{

	Ticket bootTicket(JourneyInfo journeyInfo_1, PassengerInfo passengerInfo_2) throws RemoteException;
}
