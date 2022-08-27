
package in.co.irctc.service.jaxws;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import in.co.irctc.service.jaxws.BookTicket;

@XmlRootElement(name = "bookTicket", namespace = "http://irctc.co.in/rail/service")
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "bookTicket", namespace = "http://irctc.co.in/rail/service", propOrder = {
    "journeyInfo",
    "passengerInfo"
})
public class BookTicket {

    @XmlElement(name = "journeyInfo", namespace = "http://irctc.co.in/rail/types")
    private in.co.irctc.types.JourneyInfo journeyInfo;
    @XmlElement(name = "passengerInfo", namespace = "http://irctc.co.in/rail/types")
    private in.co.irctc.types.PassengerInfo passengerInfo;

    /**
     * 
     * @return
     *     returns JourneyInfo
     */
    public in.co.irctc.types.JourneyInfo getJourneyInfo() {
        return this.journeyInfo;
    }

    /**
     * 
     * @param journeyInfo
     *     the value for the journeyInfo property
     */
    public void setJourneyInfo(in.co.irctc.types.JourneyInfo journeyInfo) {
        this.journeyInfo = journeyInfo;
    }

    /**
     * 
     * @return
     *     returns PassengerInfo
     */
    public in.co.irctc.types.PassengerInfo getPassengerInfo() {
        return this.passengerInfo;
    }

    /**
     * 
     * @param passengerInfo
     *     the value for the passengerInfo property
     */
    public void setPassengerInfo(in.co.irctc.types.PassengerInfo passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

}
