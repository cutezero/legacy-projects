package com.tourmanager.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="package-info")
public class PackageInfo {

	@XmlElement(name="package-name")
	protected String packageName;
	@XmlElement(name="package-id")
	protected String packageId;
	@XmlElement(name="existing-order-id")
	protected String existingOrderId;
	@XmlElement(name="person-name")
	protected String personName;
	@XmlElement(name="mobile-no")
	protected String mobileNo;
	@XmlElement(name="email-id")
	protected String emailId;
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getExistingOrderId() {
		return existingOrderId;
	}
	public void setExistingOrderId(String existingOrderId) {
		this.existingOrderId = existingOrderId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
}
