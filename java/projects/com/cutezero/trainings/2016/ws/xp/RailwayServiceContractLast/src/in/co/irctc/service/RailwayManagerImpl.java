package in.co.irctc.service;

import java.util.Random;

import in.co.irctc.types.JourneyInfo;
import in.co.irctc.types.PassengerInfo;
import in.co.irctc.types.Ticket;

import javax.jws.WebService;

@WebService(endpointInterface="in.co.irctc.service.RailwayManager" )
public class RailwayManagerImpl {

	public Ticket bookTicket(JourneyInfo journeyInfo, PassengerInfo passengerInfo){
		Ticket ticket= new Ticket();
		ticket.setAmount(passengerInfo.getAge());
		ticket.setPnr(passengerInfo.getMobile());
		ticket.setSeatNo(journeyInfo.getDestination());
		ticket.setTrainNo(journeyInfo.getTrainNo());
		
		Random random= new Random(10);
		System.out.println(random.nextInt());
		return ticket;
	}
}
