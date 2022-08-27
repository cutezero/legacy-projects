package com.cfn.beans;

import java.util.List;

public class MovieLister {
	private int year;
	private MovieFinder finder;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MovieFinder getFinder() {
		return finder;
	}
	public void setFinder(MovieFinder finder) {
		this.finder = finder;
	}
	public void printMoviesByYear()
	{
		List<Movie> found=finder.findMovieByYear(year);
		for(Movie movie: found){
			System.out.println(movie);
		}
	}
}
