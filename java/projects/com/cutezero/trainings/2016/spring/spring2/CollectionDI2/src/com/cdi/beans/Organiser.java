package com.cdi.beans;

import java.util.Map;
import java.util.Properties;

public class Organiser {

	private Properties hostInfo;
	private Map<String, Meeting> meetingList;
	public Organiser(Map<String, Meeting> meetingList) {
		super();
		this.meetingList = meetingList;
	}
	public Properties getHostInfo() {
		return hostInfo;
	}
	public void setHostInfo(Properties hostInfo) {
		this.hostInfo = hostInfo;
	}
	
	
	
}
