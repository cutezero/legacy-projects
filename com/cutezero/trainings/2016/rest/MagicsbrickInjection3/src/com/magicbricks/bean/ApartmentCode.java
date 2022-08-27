package com.magicbricks.bean;

public class ApartmentCode {

	protected String category;
	protected int apartmentNo;
/*
	public ApartmentCode(String apartmentCode) {
		if (apartmentCode != null && apartmentCode.length() >= 6) {
			category = apartmentCode.substring(0, 2);
			apartmentNo = Integer.parseInt(apartmentCode.substring(2));
		}
	}
*/
	public static ApartmentCode valueOf(String apartmentCode) {
		ApartmentCode apartmentCode2 = new ApartmentCode();

		if (apartmentCode != null && apartmentCode.length() >= 6) {
			apartmentCode2.setCategory(apartmentCode.substring(0, 2));
			apartmentCode2.setApartmentNo(Integer.parseInt(apartmentCode.substring(2)));
		}
		return apartmentCode2;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getApartmentNo() {
		return apartmentNo;
	}

	public void setApartmentNo(int apartmentNo) {
		this.apartmentNo = apartmentNo;
	}

}
