package com.query.bo;

import java.util.List;

public class CustomerJobSheetBo {

	protected CustomerBo customerBo;
	protected List<JobSheetBo> jobSheets;
	public CustomerBo getCustomerBo() {
		return customerBo;
	}
	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}
	public List<JobSheetBo> getJobSheets() {
		return jobSheets;
	}
	public void setJobSheets(List<JobSheetBo> jobSheets) {
		this.jobSheets = jobSheets;
	}
	@Override
	public String toString() {
		return "CustomerJobSheetBo [customerBo=" + customerBo + ", jobSheets=" + jobSheets + "]";
	}
	
	
}
