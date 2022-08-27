package com.sathya.hibernate.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Book
{
	@Id
	private    int   bookId;
	
	@Column(length=10)
	private   String   bookName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="book_author",
	joinColumns=@JoinColumn(name="bookid_fk", referencedColumnName="bookid"),
	inverseJoinColumns=@JoinColumn(name="authorid_fk", referencedColumnName="authorid"))
	private  Set<Author>    authors;
	
	public   Book(){  }
	
	public   Book(int  bookId,  String   bookName)
	{
		this.bookId=bookId;
		this.bookName=bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public  Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	


}
