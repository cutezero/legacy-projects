package com.pak;

import java.util.ArrayList;
import java.util.List;

public class MovieFinder 
{
 private static List<Movi> moviList;
 static
 {
	 moviList.add(new Movi(2016,"sultan"));
	 moviList.add(new Movi(2016,"Dangal"));
	 moviList.add(new Movi(2016,"Dhruva"));
	 moviList.add(new Movi(2017,"BossBaby"));
	 moviList.add(new Movi(2017,"baby"));
	 moviList.add(new Movi(2017,"banda"));
 }
	 
	 
	 
	 public List<Movi> findMoviByYear(int year)
	 {
		 List<Movi> foundList=new ArrayList<Movi>();
		 for(Movi movi:moviList)
		 {
			 if (movi.getYear()==year)
			{
		      foundList.add(movi);
		     }
		}
			 
		 return foundList;
		  }
 }
	 
	 
	 
	 
 
 
 
  


