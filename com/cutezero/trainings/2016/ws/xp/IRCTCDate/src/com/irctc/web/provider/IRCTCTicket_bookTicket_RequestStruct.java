// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.irctc.web.provider;


public class IRCTCTicket_bookTicket_RequestStruct {
    protected com.irctc.web.provider.JourneyInfo JourneyInfo_1;
    protected com.irctc.web.provider.PassengerInfo PassengerInfo_2;
    
    public IRCTCTicket_bookTicket_RequestStruct() {
    }
    
    public IRCTCTicket_bookTicket_RequestStruct(com.irctc.web.provider.JourneyInfo JourneyInfo_1, com.irctc.web.provider.PassengerInfo PassengerInfo_2) {
        this.JourneyInfo_1 = JourneyInfo_1;
        this.PassengerInfo_2 = PassengerInfo_2;
    }
    
    public com.irctc.web.provider.JourneyInfo getJourneyInfo_1() {
        return JourneyInfo_1;
    }
    
    public void setJourneyInfo_1(com.irctc.web.provider.JourneyInfo JourneyInfo_1) {
        this.JourneyInfo_1 = JourneyInfo_1;
    }
    
    public com.irctc.web.provider.PassengerInfo getPassengerInfo_2() {
        return PassengerInfo_2;
    }
    
    public void setPassengerInfo_2(com.irctc.web.provider.PassengerInfo PassengerInfo_2) {
        this.PassengerInfo_2 = PassengerInfo_2;
    }
}