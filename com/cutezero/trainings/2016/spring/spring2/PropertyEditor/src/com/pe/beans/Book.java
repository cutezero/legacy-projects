package com.pe.beans;

import java.io.File;
import java.net.URL;
import java.util.Date;

public class Book {

	private int isbn;
	private String title;
	private Date publishedDate;
	private URL website;
	private String[] authors;
	private File document;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public URL getWebsite() {
		return website;
	}
	public void setWebsite(URL website) {
		this.website = website;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	public File getDocument() {
		return document;
	}
	public void setDocument(File document) {
		this.document = document;
	}
	
	
}
