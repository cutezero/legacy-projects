package com.cfn.beans;

import java.util.ArrayList;
import java.util.List;

public class MovieFinder {
	private static List<Movie> moviesList;
	static {
		moviesList= new ArrayList<>();
		moviesList.add(new Movie(2016,"Lucy"));
		moviesList.add(new Movie(2016, "Kungfu Panda3"));
		moviesList.add(new Movie(2016, "Jack Reacher2"));
		moviesList.add(new Movie(2017,"Boss baby"));
		moviesList.add(new Movie(2017,"Ghost in the Shell"));
		moviesList.add(new Movie(2017, "Kunfu Yoga"));
		
	}
	public List<Movie> findMovieByYear(int year){
		List<Movie> foundList= new ArrayList<>();
		for(Movie movie: moviesList)
		{
			if (movie.getYear()==year)
			{
				foundList.add(movie);
			}
		}
		return foundList;
	}
}