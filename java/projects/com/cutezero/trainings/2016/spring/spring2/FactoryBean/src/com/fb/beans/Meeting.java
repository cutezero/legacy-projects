package com.fb.beans;

import java.util.Calendar;

public class Meeting {

	private int meetingNo;
	private String Description;
	private Calendar scheduledDate;
	public int getMeetingNo() {
		return meetingNo;
	}
	public void setMeetingNo(int meetingNo) {
		this.meetingNo = meetingNo;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Calendar getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(Calendar scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	@Override
	public String toString() {
		return "Meeting [meetingNo=" + meetingNo + ", Description=" + Description + ", scheduledDate=" + scheduledDate.getTime()
				+ "]";
	}
	
	
}
