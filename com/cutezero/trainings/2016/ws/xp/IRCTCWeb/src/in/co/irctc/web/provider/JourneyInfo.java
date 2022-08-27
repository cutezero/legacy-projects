package in.co.irctc.web.provider;

public class JourneyInfo {

	private String source;
	private String destination;
	private String journeyDate;
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
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "JourneyInfo [source=" + source + ", destination=" + destination
				+ ", journeyDate=" + journeyDate + "]";
	}
	
	
	
}
