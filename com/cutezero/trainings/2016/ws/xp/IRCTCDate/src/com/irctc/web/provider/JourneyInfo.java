package com.irctc.web.provider;

import java.util.Date;

public class JourneyInfo {

	private String source;
	private String destination;
	private Date journeyDate;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "JourneyInfo [source=" + source + ", destination=" + destination
				+ ", journeyDate=" + journeyDate + "]";
	}
}
