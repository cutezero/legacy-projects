package com.epdo.ep.events;

import org.springframework.context.ApplicationEvent;

public class UpdateEvent extends ApplicationEvent{

	private String nameToUpdate;
	
	public UpdateEvent(Object source, String nameToUpdate) {
		super(source);
		this.nameToUpdate=nameToUpdate;
	}

	public String getNameToUpdate() {
		return nameToUpdate;
	}

	
}
