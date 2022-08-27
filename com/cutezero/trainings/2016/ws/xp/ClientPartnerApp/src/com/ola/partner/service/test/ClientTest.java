package com.ola.partner.service.test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.ola.partner.service.Ola_PortType;
import com.ola.partner.service.Ola_Service;
import com.ola.partner.service.Ola_Service_Impl;
import com.ola.partner.service.Passenger;
import com.ola.partner.service.RideDetails;
import com.ola.partner.service.Trip;

public class ClientTest {

	public static void main(String[] args) throws ServiceException, RemoteException {
		Ola_Service service= new Ola_Service_Impl();
		Ola_PortType portType=service.getOlaSOAPPort();
		Trip trip= new Trip();
		trip.setCabType("Prime");
		trip.setSource("Ameerpet");
		trip.setDestination("Hightech city");
		trip.setPromoCode("Ola4556");
		
		Passenger passenger= new Passenger();
		passenger.setNoOfPassenger(2);
		passenger.setPassengerId("osad90");
		passenger.setPassengerName("Sriaknta");
		passenger.setPassengerMobileNo("4584093");
		passenger.setPassengerEmail("sri@gmsil.com");
		
		RideDetails rideDetails= portType.bookRide(trip, passenger);
		System.out.println(rideDetails.getCabNo());
		System.out.println(rideDetails.getDriverName());
	}
}
