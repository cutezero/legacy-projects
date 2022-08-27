// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.ola.partner.service;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class Ola_bookRide_RequestStruct2_SOAPBuilder implements SOAPInstanceBuilder {
    private com.ola.partner.service.Ola_bookRide_RequestStruct2 _instance;
    private com.ola.partner.service.Trip trip;
    private com.ola.partner.service.Passenger passenger;
    private static final int myTRIP_INDEX = 0;
    private static final int myPASSENGER_INDEX = 1;
    
    public Ola_bookRide_RequestStruct2_SOAPBuilder() {
    }
    
    public void setTrip(com.ola.partner.service.Trip trip) {
        this.trip = trip;
    }
    
    public void setPassenger(com.ola.partner.service.Passenger passenger) {
        this.passenger = passenger;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myTRIP_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myPASSENGER_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public void construct() {
    }
    
    public void setMember(int index, java.lang.Object memberValue) {
        try {
            switch(index) {
                case myTRIP_INDEX:
                    _instance.setTrip((com.ola.partner.service.Trip)memberValue);
                    break;
                case myPASSENGER_INDEX:
                    _instance.setPassenger((com.ola.partner.service.Passenger)memberValue);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        catch (java.lang.RuntimeException e) {
            throw e;
        }
        catch (java.lang.Exception e) {
            throw new DeserializationException(new LocalizableExceptionAdapter(e));
        }
    }
    
    public void initialize() {
    }
    
    public void setInstance(java.lang.Object instance) {
        _instance = (com.ola.partner.service.Ola_bookRide_RequestStruct2)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}