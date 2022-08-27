package com.ola.services;

import java.rmi.RemoteException;

public class Ola_PortTypeImpl implements Ola_PortType {

	public RideDetails bookRide(Trip trip, Passenger passenger)
			throws RemoteException {
		RideDetails rideDetails= new RideDetails();
		rideDetails.setCabNo(trip.getCabType());
		rideDetails.setDriverMobileNo(passenger.getPassengerMobileNo());
		rideDetails.setDriverName(passenger.getPassengerName());
		rideDetails.setEstimatedAmount(4349);
		return rideDetails;
	}

}
