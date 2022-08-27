package com.bpp.beans;

public class EBook {

	private String isbn;
	private String bookId;
	private String title;
	private int sizeInMB;
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSizeInMB(int sizeInMB) {
		this.sizeInMB = sizeInMB;
	}
	@Override
	public String toString() {
		return "EBook [isbn=" + isbn + ", bookId=" + bookId + ", title=" + title + ", sizeInMB=" + sizeInMB + "]";
	}
	
	
}
