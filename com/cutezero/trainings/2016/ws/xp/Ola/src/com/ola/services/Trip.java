// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.ola.services;


public class Trip {
    protected java.lang.String source;
    protected java.lang.String destination;
    protected java.lang.String cabType;
    protected java.lang.String promoCode;
    
    public Trip() {
    }
    
    public Trip(java.lang.String source, java.lang.String destination, java.lang.String cabType, java.lang.String promoCode) {
        this.source = source;
        this.destination = destination;
        this.cabType = cabType;
        this.promoCode = promoCode;
    }
    
    public java.lang.String getSource() {
        return source;
    }
    
    public void setSource(java.lang.String source) {
        this.source = source;
    }
    
    public java.lang.String getDestination() {
        return destination;
    }
    
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }
    
    public java.lang.String getCabType() {
        return cabType;
    }
    
    public void setCabType(java.lang.String cabType) {
        this.cabType = cabType;
    }
    
    public java.lang.String getPromoCode() {
        return promoCode;
    }
    
    public void setPromoCode(java.lang.String promoCode) {
        this.promoCode = promoCode;
    }
}
