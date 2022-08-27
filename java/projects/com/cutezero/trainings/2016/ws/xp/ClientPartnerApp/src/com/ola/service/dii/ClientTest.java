package com.ola.service.dii;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

import com.ola.partner.client.Passenger;
import com.ola.partner.client.RideDetails;
import com.ola.partner.client.Trip;

public class ClientTest {

	
	public static void main(String[] args) throws ServiceException, RemoteException {
		String targetNamespace="http://ola.com/cabs/services";
		String serviceName="ola";
		String portName="olaSOAPPort";
		String operationName="bookRide";
		String returnType="rideDetails";
		
		String typeNamespace="http://ola.com/cabs/types";
		String elementName1="trip";
		String elementName2="passenger";
		String elementType1="Trip";
		String elementType2="Passenger";
		String endPointURL="http://localhost:8080/Ola3/olaRide";
		String soapAction="http://ola.com/cabs/services#bookRide";
		String encodingStyle="http://schemas.xmlsoap.org/soap/encoding/";
		
		
		ServiceFactory serviceFactory= ServiceFactory.newInstance();
		Service olaService=serviceFactory.createService(new QName(targetNamespace,serviceName));
		Call rideCall= olaService.createCall(new QName(targetNamespace, portName));
		rideCall.setOperationName(new QName(targetNamespace, operationName));
		rideCall.addParameter(elementName1, new QName(typeNamespace, elementType1),Trip.class, ParameterMode.IN);
		rideCall.addParameter(elementName2, new QName(typeNamespace, elementType2),Passenger.class, ParameterMode.IN);
		rideCall.setReturnType(new QName(typeNamespace, returnType),RideDetails.class);
		rideCall.setTargetEndpointAddress(endPointURL);
		rideCall.setProperty(Call.SOAPACTION_USE_PROPERTY, true);
		rideCall.setProperty(Call.SOAPACTION_URI_PROPERTY, soapAction);
		rideCall.setProperty(Call.ENCODINGSTYLE_URI_PROPERTY, encodingStyle);
		
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


		RideDetails rideDetails=(RideDetails) rideCall.invoke(new Object[]{trip, passenger});
		System.out.println("Result : "+rideDetails.getDriverName());
		System.out.println("Result Amount : "+rideDetails.getEstimatedAmount());
	}
}
