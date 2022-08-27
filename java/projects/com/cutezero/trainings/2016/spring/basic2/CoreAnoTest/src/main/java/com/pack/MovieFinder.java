package com.pack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service 
public class MovieFinder 
{
	public static List<Movie> moviesList;
	static
	{
		moviesList=new ArrayList<Movie>();
		moviesList.add(new Movie(2016,"Dangal"));
		moviesList.add(new Movie(2016,"Sultan"));
		moviesList.add(new Movie(2016,"Dhruba"));
		moviesList.add(new Movie(2017,"Ameerpetlo"));
		moviesList.add(new Movie(2017,"Babyboss"));
		moviesList.add(new Movie(2017,"jollyLLB"));
	}
	public List<Movie> findMovieByYear(int year)
	{
		List<Movie> foundList=new ArrayList<Movie>();
		for(Movie movie : moviesList)
		{
			if(movie.getYear()==year)
			{
				foundList.add(movie);
			}
		}
		return foundList;
	}
}
