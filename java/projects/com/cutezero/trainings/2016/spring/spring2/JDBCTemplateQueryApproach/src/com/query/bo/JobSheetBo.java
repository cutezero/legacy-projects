package com.query.bo;

import java.sql.Date;

public class JobSheetBo {

	protected int jobSheetNo;
	protected String jobSheetType;
	protected Date openedDate;
	protected int petrolLevel;
	protected int kilometer;
	protected String engineNo;
	public int getJobSheetNo() {
		return jobSheetNo;
	}
	public void setJobSheetNo(int jobSheetNo) {
		this.jobSheetNo = jobSheetNo;
	}
	public String getJobSheetType() {
		return jobSheetType;
	}
	public void setJobSheetType(String jobSheetType) {
		this.jobSheetType = jobSheetType;
	}
	public int getPetrolLevel() {
		return petrolLevel;
	}
	public Date getOpenedDate() {
		return openedDate;
	}
	public void setOpenedDate(Date openedDate) {
		this.openedDate = openedDate;
	}
	public void setPetrolLevel(int petrolLevel) {
		this.petrolLevel = petrolLevel;
	}
	public int getKilometer() {
		return kilometer;
	}
	public void setKilometer(int kilometer) {
		this.kilometer = kilometer;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	@Override
	public String toString() {
		return "JobSheetBo [jobSheetNo=" + jobSheetNo + ", jobSheetType=" + jobSheetType + ", openedDate=" + openedDate
				+ ", petrolLevel=" + petrolLevel + ", kilometer=" + kilometer + ", engineNo=" + engineNo + "]";
	}
	
	
}
