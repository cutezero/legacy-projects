package com.pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class MovieLister 
{
	@Value("${movie.year}")
	private int year;
	@Autowired
	private MovieFinder finder;
	
	public void printMoviesByYear()
	{
		
		List<Movie> found=finder.findMovieByYear(year);
		for(Movie movie: found)
		{
			System.out.println(movie);
		}
	}
}
