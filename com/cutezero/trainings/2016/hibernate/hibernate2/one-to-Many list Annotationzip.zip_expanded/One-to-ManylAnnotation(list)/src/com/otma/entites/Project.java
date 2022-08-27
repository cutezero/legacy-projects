package com.otma.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Project")
public class Project implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="project_no")
	protected int project_no;
	protected String titale;
	protected String description;
	protected int duration;
	@OneToMany
	//@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "SOURCE_PROJECT_NO", joinColumns = { @JoinColumn(name = "PROJECT_NO") }, inverseJoinColumns = { @JoinColumn(name = "RESOURCE_NO") })
	protected List<Resource> resources;
	public void setProject_no(int project_no) {
		this.project_no = project_no;
	}
	public void setTitale(String titale) {
		this.titale = titale;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	public int getProject_no() {
		return project_no;
	}
	public String getTitale() {
		return titale;
	}
	public String getDescription() {
		return description;
	}
	public int getDuration() {
		return duration;
	}
	public List<Resource> getResources() {
		return resources;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + duration;
		result = prime * result + project_no;
		result = prime * result + ((titale == null) ? 0 : titale.hashCode());
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
		Project other = (Project) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (duration != other.duration)
			return false;
		if (project_no != other.project_no)
			return false;
		if (titale == null) {
			if (other.titale != null)
				return false;
		} else if (!titale.equals(other.titale))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Project [project_no=" + project_no + ", titale=" + titale + ", description=" + description
				+ ", duration=" + duration + ", resources=" + resources + "]";
	}
	
	

}
