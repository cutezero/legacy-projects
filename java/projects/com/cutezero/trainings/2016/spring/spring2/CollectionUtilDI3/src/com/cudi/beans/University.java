package com.cudi.beans;

import java.util.Map;
import java.util.Properties;

public class University {

	private Map<String, Course> hod;
	private Properties toppers;

	public void setHod(Map<String, Course> hod) {
		this.hod = hod;
	}

	public void setToppers(Properties toppers) {
		this.toppers = toppers;
	}

	@Override
	public String toString() {
		return "University [hod=" + hod + ", toppers=" + toppers + "]";
	}

	
	
}
