package com.ola.partner.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.securityRoleRefType;

public class ClientTest {

	public static void main(String[] args) throws MalformedURLException, ServiceException, RemoteException {
		ServiceFactory factory= ServiceFactory.newInstance();
		Service ola= factory.createService(new URL("http://localhost:8080/Ola3/olaRide?WSDL"), new QName("http://ola.com/cabs/services", "ola"));
		Ola port= (Ola) ola.getPort(new QName("http://ola.com/cabs/services", "olaSOAPPort"), Ola.class);
		
		Trip trip= new Trip();
		trip.setCabType("Sedan");
		trip.setSource("HYD");
		trip.setDestination("BAM");
		trip.setPromoCode("Today89");

		Passenger passenger= new Passenger();
		passenger.setNoOfPassenger(3);
		passenger.setPassengerEmail("fsj@jife.dpo");
		passenger.setPassengerId("ifs9");
		passenger.setPassengerMobileNo("898079");
		passenger.setPassengerName("Nakld");
		
		RideDetails rideDetails=port.bookRide(trip, passenger);
		System.out.println(rideDetails.getDriverName());
		
	}
}
