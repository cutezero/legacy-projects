package com.vr.dto;

public class ReportDto {

	protected int reportId;
	protected String name;
	protected String mobile;
	protected String email;
	
	public ReportDto() {
		//default constructor
	}
	public ReportDto(int reportId, String name, String mobile, String email) {
		super();
		this.reportId = reportId;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
