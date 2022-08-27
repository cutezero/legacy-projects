package com.epdo.ep.events;

import org.springframework.context.ApplicationEvent;

public class ReloadEvent extends ApplicationEvent{

	private String name;
	
	public ReloadEvent(Object source, String name) {
		super(source);
		this.name=name;
	}

	public String getName() {
		return name;
	}

	
}
