package com.sathya.hibernate.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author 
{
	@Id
	private    int        authorid;
	
	@Column(length=10)
	private    String    authorName;
	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="authors")
	private    Set<Book>    books;
	
	public   Author(){   }
	public   Author(int   authorid,  String   authorName)
	{
		this.authorid=authorid;
		this.authorName=authorName;
	}
	
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	

}
