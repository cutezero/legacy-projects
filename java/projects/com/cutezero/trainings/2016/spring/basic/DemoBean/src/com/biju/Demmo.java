package com.biju;

import java.util.List;
import java.util.Map;

public class Demmo 
{
private Map theMap;
private List theList;

public void setTheMap(Map theMap)
{
	this.theMap=theMap;
}

public void setTheList(List theList)
{
	this.theList=theList;
}


public void showTheMap()
{
String str=theMap.getClass().getName();
System.out.println("container has created the obj of"+str);
System.out.println(theMap);
}
public void showTheList()
{
String str=theList.getClass().getName();
System.out.println("container has created the obj of"+str);
System.out.println(theList);
}
}





