package com.epdo.ep.handlers;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.ApplicationListener;

import com.epdo.dao.DBAccess;
import com.epdo.ep.events.AddEvent;

public class AddEventListener implements ApplicationListener<AddEvent> {

	private String nameToAdd;
	private String propertiesFileName;
	private Properties properties;
	
	@Override
	public void onApplicationEvent(AddEvent event) {
		properties=new Properties();
		nameToAdd=event.getNameToAdd();
		System.out.println("Event name : "+nameToAdd);
		//for properties
/*		try {
			properties.load(this.getClass().getClassLoader().getResourceAsStream(propertiesFileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		properties.setProperty(event.getIdToAdd(), event.getNameToAdd());
		System.out.println("Added ID as : "+event.getIdToAdd()+" \n and value as : "+event.getNameToAdd());
*/		
		DBAccess dbAccess=new DBAccess();
		dbAccess.insertData2DB(event.getIdToAdd(), event.getNameToAdd());
		
	}

	public void setPropertiesFileName(String propertiesFileName) {
		this.propertiesFileName = propertiesFileName;
	}

	
	
}
