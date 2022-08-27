
package in.co.irctc.service.jaxws;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import in.co.irctc.service.jaxws.BookTicketResponse;

@XmlRootElement(name = "bookTicketResponse", namespace = "http://irctc.co.in/rail/service")
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "bookTicketResponse", namespace = "http://irctc.co.in/rail/service")
public class BookTicketResponse {

    @XmlElement(name = "ticket", namespace = "http://irctc.co.in/rail/types")
    private in.co.irctc.types.Ticket _return;

    /**
     * 
     * @return
     *     returns Ticket
     */
    public in.co.irctc.types.Ticket get_return() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void set_return(in.co.irctc.types.Ticket _return) {
        this._return = _return;
    }

}
