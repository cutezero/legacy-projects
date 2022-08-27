import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="student")
@SecondaryTable(name="student_total", pkJoinColumns=@PrimaryKeyJoinColumn(name="id"))
public class Student {
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", Marks1=" + Marks1 + ", Marks2="
				+ Marks2 + ", marks3=" + marks3 + ", total=" + total + ", average=" + average + "]";
	}
	@Id
	@Column(name="sid")
	private int studentId;
	@Column(name="sname")
	private String studentName;
	
	private int Marks1;
	private int Marks2;
	private int marks3;
	@Column(table="student_total")
	private int total;
	@Column(table="student_total")
	private double average;
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
	public int getMarks1() {
		return Marks1;
	}
	public void setMarks1(int marks1) {
		Marks1 = marks1;
	}
	public int getMarks2() {
		return Marks2;
	}
	public void setMarks2(int marks2) {
		Marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
}
