package com.at.commands;

import org.springframework.stereotype.Component;

@Component
public class JobDetailsCommand {

	protected int jobNo;
	protected String jobTitle;
	protected String jobDescription;
	protected int jobExperience;
	protected String jobQualification;
	protected int companyId;
	protected String companyName;
	protected String companyServiceType;
	protected String companyLocation;
	public int getJobNo() {
		return jobNo;
	}
	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public int getJobExperience() {
		return jobExperience;
	}
	public void setJobExperience(int jobExperience) {
		this.jobExperience = jobExperience;
	}
	public String getJobQualification() {
		return jobQualification;
	}
	public void setJobQualification(String jobQualification) {
		this.jobQualification = jobQualification;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyServiceType() {
		return companyServiceType;
	}
	public void setCompanyServiceType(String companyServiceType) {
		this.companyServiceType = companyServiceType;
	}
	public String getCompanyLocation() {
		return companyLocation;
	}
	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}
	
	
	
}
