package com.epdo.ep.events;

import org.springframework.context.ApplicationEvent;

public class AddEvent extends ApplicationEvent{

	private String nameToAdd;
	private String idToAdd;
	
	/**
	 * The super class doesn't have default constructor so this implementation class must define a 
	 * parameterized constructor to call the super class parameterized construcctor 
	 * for creating an object of it-self
	 * @param source
	 */
	public AddEvent(Object source,String idToAdd, String nameToAdd) {
		super(source);
		this.idToAdd=idToAdd;
		this.nameToAdd=nameToAdd;
	}

	public String getNameToAdd() {
		return nameToAdd;
	}

	public String getIdToAdd() {
		return idToAdd;
	}

	
	
	
	
}
