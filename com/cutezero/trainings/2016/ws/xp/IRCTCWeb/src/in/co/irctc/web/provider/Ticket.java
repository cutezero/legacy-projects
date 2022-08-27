package in.co.irctc.web.provider;

public class Ticket {

	private long pnr;
	private int trainNumber;
	private String seatNo;
	public long getPnr() {
		return pnr;
	}
	public void setPnr(long pnr) {
		this.pnr = pnr;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", trainNumber=" + trainNumber
				+ ", seatNo=" + seatNo + "]";
	}
	
}
