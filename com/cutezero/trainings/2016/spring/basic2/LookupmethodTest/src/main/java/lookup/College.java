package lookup;

public abstract class College {
	
	private int collegeId;
	private String collegeName;
	private String collegeAddress;
	
	public College(){
		System.out.println("I think this is College Class object construct");
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	
	public abstract Student getInstance();
	
	public void receive(){
		getInstance().store();
		System.out.println("this is rceive method in College");
	}
		
}
