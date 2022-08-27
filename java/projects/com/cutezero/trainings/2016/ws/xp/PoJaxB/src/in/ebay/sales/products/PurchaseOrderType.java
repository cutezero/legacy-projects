//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.09 at 11:02:09 PM GMT-12:00 
//


package in.ebay.sales.products;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import in.ebay.sales.products.ItemsType;
import in.ebay.sales.products.PurchaseOrderType;
import in.ebay.sales.products.ShippingAddressType;


/**
 * <p>Java class for purchaseOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="items" type="{http://ebay.in/sales/products}itemsType"/>
 *         &lt;element name="shippingAddress" type="{http://ebay.in/sales/products}shippingAddressType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "purchaseOrderType", propOrder = {
    "items",
    "shippingAddress"
})
@XmlRootElement(name="puchaseOrder")
public class PurchaseOrderType {

    @XmlElement(namespace = "http://ebay.in/sales/products")
    protected ItemsType items;
    @XmlElement(namespace = "http://ebay.in/sales/products")
    protected ShippingAddressType shippingAddress;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ItemsType }
     *     
     */
    public ItemsType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemsType }
     *     
     */
    public void setItems(ItemsType value) {
        this.items = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAddressType }
     *     
     */
    public ShippingAddressType getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAddressType }
     *     
     */
    public void setShippingAddress(ShippingAddressType value) {
        this.shippingAddress = value;
    }

}