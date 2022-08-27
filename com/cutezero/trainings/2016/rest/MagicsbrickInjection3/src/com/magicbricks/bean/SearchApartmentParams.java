package com.magicbricks.bean;

import java.util.List;

import javax.ws.rs.MatrixParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class SearchApartmentParams {

	@PathParam("loc")
	protected String location;
	@PathParam("area")
	protected String area;
	@MatrixParam("sqYard")
	protected int sqYard;
	@QueryParam("apartmentType")
	protected String apartmentType;
	@QueryParam("aminities")
	protected List<String> aminities;
	@QueryParam("builder")
	protected String builder;
	@QueryParam("facing")
	protected String facing;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getSqYard() {
		return sqYard;
	}
	public void setSqYard(int sqYard) {
		this.sqYard = sqYard;
	}
	public String getApartmentType() {
		return apartmentType;
	}
	public void setApartmentType(String apartmentType) {
		this.apartmentType = apartmentType;
	}
	public List<String> getAminities() {
		return aminities;
	}
	public void setAminities(List<String> aminities) {
		this.aminities = aminities;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getFacing() {
		return facing;
	}
	public void setFacing(String facing) {
		this.facing = facing;
	}
	@Override
	public String toString() {
		return "SearchApartmentParams [location=" + location + ", area=" + area + ", sqYard=" + sqYard
				+ ", apartmentType=" + apartmentType + ", aminities=" + aminities + ", builder=" + builder + ", facing="
				+ facing + "]";
	}
	
	
	
}
