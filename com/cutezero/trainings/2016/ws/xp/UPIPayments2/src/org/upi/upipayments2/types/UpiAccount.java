
package org.upi.upipayments2.types;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.upi.upipayments2.types.UpiAccount;


/**
 * <p>Java class for upi-account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="upi-account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vpa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ifsc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="account-holder-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "upi-account", propOrder = {
    "vpa",
    "ifsc",
    "accountHolderName"
})
public class UpiAccount {

    protected String vpa;
    protected String ifsc;
    @XmlElement(name = "account-holder-name")
    protected String accountHolderName;

    /**
     * Gets the value of the vpa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpa() {
        return vpa;
    }

    /**
     * Sets the value of the vpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpa(String value) {
        this.vpa = value;
    }

    /**
     * Gets the value of the ifsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfsc() {
        return ifsc;
    }

    /**
     * Sets the value of the ifsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfsc(String value) {
        this.ifsc = value;
    }

    /**
     * Gets the value of the accountHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Sets the value of the accountHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderName(String value) {
        this.accountHolderName = value;
    }

}
