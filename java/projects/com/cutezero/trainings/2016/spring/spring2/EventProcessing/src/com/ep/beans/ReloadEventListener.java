package com.ep.beans;

import org.springframework.context.ApplicationListener;

//Role - as Handler in the Event processing Model
public class ReloadEventListener implements ApplicationListener<ReloadEvent> {

	@Override
	public void onApplicationEvent(ReloadEvent event) {
		System.out.println("From Reload EventListener : ");
		System.out.println("Reloading the cache : "+event.getTableName());
		
	}

	
}
