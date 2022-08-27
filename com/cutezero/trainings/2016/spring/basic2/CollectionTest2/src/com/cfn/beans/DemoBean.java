package com.cfn.beans;

import java.util.Properties;
import java.util.Set;

public class DemoBean {
		private Properties theProps;
		private Set theSet;
		
		
		public void setTheProps(Properties theProps) {
			this.theProps = theProps;
		}
		public void setTheSet(Set theSet) {
			this.theSet = theSet;
		}
		public void showTheProps()
		{
			String str1=theProps.getClass().getName();
			System.out.println("the implemented class of Properties is: "+str1);
			System.out.println(theProps);
		}
		public void showTheSet()
		{
			String str1=theSet.getClass().getName();
			System.out.println("the implemented class of Set is: "+str1);
			System.out.println(theSet);
		}
}
