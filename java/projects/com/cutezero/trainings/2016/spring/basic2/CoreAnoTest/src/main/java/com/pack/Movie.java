package com.pack;

public class Movie 
{
	private int year;
	private String name;
	public Movie(int year,String name)
	{
		this.year=year;
		this.name=name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "[year:"+year+" movie:"+name+"]";
	}
}
