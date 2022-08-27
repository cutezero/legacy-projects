package com.cfn.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppClassesFactory {

	public static Properties propertiesFile; 

	static{
		if (propertiesFile==null){
			propertiesFile = new Properties();

			//Absolute Path
			// InputStream stream=new FileInputStream(new File("G:/SRIMAN_SpringWorkspace/StrategyDesignPattern/com/cfn/beans/appClassNames.properties"));

			//Relative Path		
			// InputStream stream=new FileInputStream(new File("%Work_Dir%/StrategyDesignPattern/com/cfn/beans/appClassNames.properties"));

			InputStream inputStream = AppClassesFactory.class.getClassLoader().getResourceAsStream("com/cfn/commons/appClassNames.properties");
			try {
				propertiesFile.load(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static Object createObject(String lclazz) {
		Object clazz=null;
		try {
			String className = propertiesFile.getProperty(lclazz);
			clazz = Class.forName(className).newInstance();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clazz;
	}
}
