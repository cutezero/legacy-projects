package pack1.dao;

public class Employee 
{
	private int empNo;
	private String eName;
	private int sal;
	private int deptNo;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", sal=" + sal + ", deptNo=" + deptNo + "]";
	}
	
}
