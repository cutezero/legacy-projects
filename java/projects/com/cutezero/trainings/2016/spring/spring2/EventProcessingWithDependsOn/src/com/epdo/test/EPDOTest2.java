package com.epdo.test;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epdo.beans.ProcessData2;
import com.epdo.util.Cache;

public class EPDOTest2 {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/epdo/common/application-context.xml");
		ProcessData2 processData=context.getBean("processData2", ProcessData2.class);
		Cache cache=context.getBean("cache", Cache.class);
		System.out.println("-----Cache related ----------");
		processData.getCity();
		processData.getState("od");
		System.out.println("-----Cache related (Ends here)----------");
		System.out.println("-----Event processing related (Ends here)----------");
//		processData.processMyEvent();
		String id="ra";
		String name="Rajasthan";
		processData.processAddEvent(id, name);
		processData.processReloadEvent(id);
//		String result=((Properties)cache.get("key_properties")).getProperty(id);
		String result=(String) ((Map)cache.get("key_db")).get(id);
		System.out.println("State result : /n ID :"+id +" value : "+result);
		System.out.println("Completed");
	}

}
