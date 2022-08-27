package com.otma.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Resource")
public class Resource implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="resource_no")
	protected int resource_no;
	protected String role;
	protected Date openingDate;
	protected Date endingDate;
	public void setResource_no(int resource_no) {
		this.resource_no = resource_no;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
	public int getResource_no() {
		return resource_no;
	}
	public String getRole() {
		return role;
	}
	public Date getOpeningDate() {
		return openingDate;
	}
	public Date getEndingDate() {
		return endingDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endingDate == null) ? 0 : endingDate.hashCode());
		result = prime * result + ((openingDate == null) ? 0 : openingDate.hashCode());
		result = prime * result + resource_no;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resource other = (Resource) obj;
		if (endingDate == null) {
			if (other.endingDate != null)
				return false;
		} else if (!endingDate.equals(other.endingDate))
			return false;
		if (openingDate == null) {
			if (other.openingDate != null)
				return false;
		} else if (!openingDate.equals(other.openingDate))
			return false;
		if (resource_no != other.resource_no)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Resource [resource_no=" + resource_no + ", role=" + role + ", openingDate=" + openingDate
				+ ", endingDate=" + endingDate + "]";
	}
	

}
