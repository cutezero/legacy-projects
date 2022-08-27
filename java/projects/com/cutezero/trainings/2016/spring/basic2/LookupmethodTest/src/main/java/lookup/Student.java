package lookup;

public class Student {
	
	private int studentId;
	private String studentName;
	private String collegeName;
	public Student(){
		System.out.println("This is Student constructor");
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public void store(){
		System.out.println("somethings stored");
	}
}
