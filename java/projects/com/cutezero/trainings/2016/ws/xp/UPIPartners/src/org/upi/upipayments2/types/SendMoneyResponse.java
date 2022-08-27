
package org.upi.upipayments2.types;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.upi.upipayments2.types.Reciept;
import org.upi.upipayments2.types.SendMoneyResponse;


/**
 * <p>Java class for sendMoneyResponse element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="sendMoneyResponse">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.upi.org/upiPayments2/types}reciept" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reciept"
})
@XmlRootElement(name = "sendMoneyResponse")
public class SendMoneyResponse {

    @XmlElement(namespace = "http://www.upi.org/upiPayments2/types")
    protected Reciept reciept;

    /**
     * Gets the value of the reciept property.
     * 
     * @return
     *     possible object is
     *     {@link Reciept }
     *     
     */
    public Reciept getReciept() {
        return reciept;
    }

    /**
     * Sets the value of the reciept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reciept }
     *     
     */
    public void setReciept(Reciept value) {
        this.reciept = value;
    }

}
