package com.ola.services;

import java.rmi.RemoteException;

public class Ola_PortTypeImpl implements Ola_PortType {

	public RideDetails bookRide(Trip trip, Passenger passenger)
			throws RemoteException {
		RideDetails details= new RideDetails();
		details.setCabNo(passenger.getPassengerId());
		details.setDriverName(passenger.getPassengerName());
		details.setDriverMobileNo(passenger.getPassengerMobileNo());
		details.setEstimatedAmount(passenger.getNoOfPassenger());
		System.out.println("Trip : \n Cab: "+trip.getCabType()+"\n Source :"+trip.getSource());
		return details;
	}

}
