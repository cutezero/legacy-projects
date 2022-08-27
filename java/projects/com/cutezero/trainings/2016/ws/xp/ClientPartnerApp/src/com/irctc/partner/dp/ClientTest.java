package com.irctc.partner.dp;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;



public class ClientTest {

	public static void main(String[] args) throws MalformedURLException, ServiceException, RemoteException {
		ServiceFactory factory= ServiceFactory.newInstance();
		javax.xml.rpc.Service irctcService=factory.createService(new URL("http://localhost:8080/IRCTCWeb/ticketInfo?WSDL"), new QName("http://irctc.co.in/partners/ticketsinfo/service", "IRCTCService"));
		IRCTCServiceSIE port=(IRCTCServiceSIE) irctcService.getPort(new QName("http://irctc.co.in/partners/ticketsinfo/service","IRCTCServiceSIEPort"), IRCTCServiceSIE.class);
		
		JourneyInfo journeyInfo_1= new JourneyInfo();
		journeyInfo_1.setDestination("Ameerpet");
		journeyInfo_1.setSource("Nature care");
		journeyInfo_1.setJourneyDate("21-12-2111");
		
		
		PassengerInfo passengerInfo_2= new PassengerInfo();
		passengerInfo_2.setAge(23);
		passengerInfo_2.setName("Srikanta");
		passengerInfo_2.setProofId("sd897");
		
		Ticket ticket=port.bootTicket(journeyInfo_1, passengerInfo_2);
		System.out.println(ticket.getPnr());
		System.out.println(ticket.getSeatNo());
		System.out.println(ticket.getTrainNo());
		
	}
}
