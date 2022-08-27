package com.epdo.ep.handlers;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;

import com.epdo.ep.events.ReloadEvent;
import com.epdo.helper.CacheManager;

public class ReloadEventListener implements ApplicationListener<ReloadEvent>, ApplicationContextAware {

	private CacheManager cacheManager=null;
	private ApplicationContext context;
	
	@Override
	public void onApplicationEvent(ReloadEvent event) {
		System.out.println("Reload event received : "+event.getName());
		cacheManager=context.getBean("cacheManager", CacheManager.class);
		try {
			cacheManager.reload();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
	}

}
