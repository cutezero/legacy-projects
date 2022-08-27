// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.ola.services;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class RideDetails_SOAPBuilder implements SOAPInstanceBuilder {
    private com.ola.services.RideDetails _instance;
    private java.lang.String cabNo;
    private java.lang.String driverName;
    private java.lang.String driverMobileNo;
    private float estimatedAmount;
    private static final int myCABNO_INDEX = 0;
    private static final int myDRIVERNAME_INDEX = 1;
    private static final int myDRIVERMOBILENO_INDEX = 2;
    private static final int myESTIMATEDAMOUNT_INDEX = 3;
    
    public RideDetails_SOAPBuilder() {
    }
    
    public void setCabNo(java.lang.String cabNo) {
        this.cabNo = cabNo;
    }
    
    public void setDriverName(java.lang.String driverName) {
        this.driverName = driverName;
    }
    
    public void setDriverMobileNo(java.lang.String driverMobileNo) {
        this.driverMobileNo = driverMobileNo;
    }
    
    public void setEstimatedAmount(float estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myCABNO_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myDRIVERNAME_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myDRIVERMOBILENO_INDEX:
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
                case myCABNO_INDEX:
                    _instance.setCabNo((java.lang.String)memberValue);
                    break;
                case myDRIVERNAME_INDEX:
                    _instance.setDriverName((java.lang.String)memberValue);
                    break;
                case myDRIVERMOBILENO_INDEX:
                    _instance.setDriverMobileNo((java.lang.String)memberValue);
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
        _instance = (com.ola.services.RideDetails)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
