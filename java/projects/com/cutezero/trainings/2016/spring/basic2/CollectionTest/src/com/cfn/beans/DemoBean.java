package com.cfn.beans;

import java.util.List;
import java.util.Map;

public class DemoBean {
		private List theList;
		private Map theMap;
		public void setTheList(List theList)
		{
			this.theList=theList;
		}
		public void setTheMap(Map theMap)
		{
			this.theMap=theMap;
		}
		public void showTheList()
		{
			String str1=theList.getClass().getName();
			System.out.println("the implemented class of List is: "+str1);
			System.out.println(theList);
		}
		public void showTheMap()
		{
			String str1=theMap.getClass().getName();
			System.out.println("the implemented class of Map is: "+str1);
			System.out.println(theMap);
		}
}
