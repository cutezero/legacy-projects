
package org.upi.upipayments2.types;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.upi.upipayments2.types.SendMoney;
import org.upi.upipayments2.types.UpiAccount;


/**
 * <p>Java class for sendMoney element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="sendMoney">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.upi.org/upiPayments2/types}from-account"/>
 *           &lt;element ref="{http://www.upi.org/upiPayments2/types}to-account"/>
 *           &lt;element ref="{http://www.upi.org/upiPayments2/types}amount"/>
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
    "fromAccount",
    "toAccount",
    "amount"
})
@XmlRootElement(name = "sendMoney")
public class SendMoney {

    @XmlElement(name = "from-account", namespace = "http://www.upi.org/upiPayments2/types")
    protected UpiAccount fromAccount;
    @XmlElement(name = "to-account", namespace = "http://www.upi.org/upiPayments2/types")
    protected UpiAccount toAccount;
    @XmlElement(namespace = "http://www.upi.org/upiPayments2/types", type = Double.class)
    protected double amount;

    /**
     * Gets the value of the fromAccount property.
     * 
     * @return
     *     possible object is
     *     {@link UpiAccount }
     *     
     */
    public UpiAccount getFromAccount() {
        return fromAccount;
    }

    /**
     * Sets the value of the fromAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpiAccount }
     *     
     */
    public void setFromAccount(UpiAccount value) {
        this.fromAccount = value;
    }

    /**
     * Gets the value of the toAccount property.
     * 
     * @return
     *     possible object is
     *     {@link UpiAccount }
     *     
     */
    public UpiAccount getToAccount() {
        return toAccount;
    }

    /**
     * Sets the value of the toAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpiAccount }
     *     
     */
    public void setToAccount(UpiAccount value) {
        this.toAccount = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

}
