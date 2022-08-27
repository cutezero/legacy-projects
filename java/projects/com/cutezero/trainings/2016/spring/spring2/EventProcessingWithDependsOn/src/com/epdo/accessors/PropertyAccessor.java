package com.epdo.accessors;

import java.util.Properties;

public class PropertyAccessor implements IAccessor {
	
	private String key;	//pass from Spring configuration file as const...injection
	private Properties properties;
	private String fileLocation;
	
	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public PropertyAccessor(String key) {
		super();
		this.key = key;
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public Object getData()  {
		
		try {
			properties=new Properties();
			properties.load(this.getClass().getClassLoader().getResourceAsStream(fileLocation));
			System.out.println("Property file loaded from resources");
			System.out.println(" States for AP : "+properties.getProperty("ap"));
			
			
		} catch (Exception e) {
			System.err.println("Can't load Property file");
			e.printStackTrace();
		}
		return properties;
	}

	
}
