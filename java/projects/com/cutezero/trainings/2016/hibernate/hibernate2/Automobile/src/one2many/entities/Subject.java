package one2many.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUBJECT")
public class Subject {

	@Id
	@GeneratedValue
	@Column(name="SUBJECT_ID")
	protected int subjectId;
	@Column(name="SUBJECT_CODE")
	protected String subjectCode;
	@Column(name="SUBJECT_NAME")
	protected String subjectName;
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectCode="
				+ subjectCode + ", subjectName=" + subjectName + "]";
	}
	
	
}
