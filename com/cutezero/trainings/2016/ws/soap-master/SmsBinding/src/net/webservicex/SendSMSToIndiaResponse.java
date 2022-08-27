
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendSMSToIndiaResult" type="{http://www.webserviceX.NET}SMSResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sendSMSToIndiaResult"
})
@XmlRootElement(name = "SendSMSToIndiaResponse")
public class SendSMSToIndiaResponse {

    @XmlElement(name = "SendSMSToIndiaResult")
    protected SMSResult sendSMSToIndiaResult;

    /**
     * Gets the value of the sendSMSToIndiaResult property.
     * 
     * @return
     *     possible object is
     *     {@link SMSResult }
     *     
     */
    public SMSResult getSendSMSToIndiaResult() {
        return sendSMSToIndiaResult;
    }

    /**
     * Sets the value of the sendSMSToIndiaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSResult }
     *     
     */
    public void setSendSMSToIndiaResult(SMSResult value) {
        this.sendSMSToIndiaResult = value;
    }

}
