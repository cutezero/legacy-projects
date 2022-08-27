package com.one2one.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="REPORT_SHEET")
public class ReportSheet implements Serializable{

	@Id
	@Column(name="STU_ID_PK_FK")
	@GenericGenerator(name="foreignKey1", strategy="foreign", parameters=@Parameter(value="student", name="property"))
	@GeneratedValue(generator="foreignKey1")
	protected String studentId;
	@Column(name="REPORT_NO", length=10)
	protected String reportNo;
	@Column(name="COMMENTS")
	protected String comments;
	@Column(name="RATING")
	protected String rating;
	
	@OneToOne(cascade=CascadeType.ALL)
//	@OneToOne
//	@PrimaryKeyJoinColumn
	protected Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getReportNo() {
		return reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	
	
	
}
