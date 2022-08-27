package one2one.bidirectional.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	//its working for numbers only
	@Column(name="ADDR_ID")
	protected int addressId;
	@Column(name="ADDR_LINE1")
	protected String addressLine1;
	@Column(name="ADDR_LINE2")
	protected String addressLine2;
	@Column(name="STREET")
	protected String street;
	@Column(name="CITY")
	protected String city;
	@Column(name="STATE")
	protected String state;
	@Column(name="COUNTRY")
	protected String country;
	@Column(name="ZIP_CODE")
	protected long zipCode;
	
	@OneToOne
	protected Customer customer;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", street="
				+ street + ", city=" + city + ", state=" + state + ", country="
				+ country + ", zipCode=" + zipCode + ", customer=" + customer
				+ "]";
	}


	
}
