import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="emp_info")
public class Emp {
	@Id
	private int empno;
	@Lob
	private Blob empImages;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public Blob getEmpImages() {
		return empImages;
	}
	public void setEmpImages(Blob empImages) {
		this.empImages = empImages;
	}
	

}
