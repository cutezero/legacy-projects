package com.epdo.ep.events;

import org.springframework.context.ApplicationEvent;

public class DeleteEvent extends ApplicationEvent{

	private String nameToDelete;
	
	public DeleteEvent(Object source, String nameToDelete) {
		super(source);
		this.nameToDelete=nameToDelete;
	}

	public String getNameToDelete() {
		return nameToDelete;
	}

	
	
}
