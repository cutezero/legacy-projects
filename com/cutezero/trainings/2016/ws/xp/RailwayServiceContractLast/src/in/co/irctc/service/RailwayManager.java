package in.co.irctc.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import in.co.irctc.types.JourneyInfo;
import in.co.irctc.types.PassengerInfo;
import in.co.irctc.types.Ticket;

@WebService(name="railwayManager", targetNamespace="http://irctc.co.in/rail/service")
public interface RailwayManager {
	
	@WebResult(name="ticket", targetNamespace="http://irctc.co.in/rail/types")
	@WebMethod(action="http://irctc.co.in/rail#bookTicket")
	public Ticket bookTicket(
			@WebParam(name="journeyInfo", targetNamespace="http://irctc.co.in/rail/types")JourneyInfo journeyInfo, 
			@WebParam(name= "passengerInfo", targetNamespace="http://irctc.co.in/rail/types")PassengerInfo passengerInfo);
}
