package com.cfn.app;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Work {

	private static int i;
	
	@Scheduled(cron= "15 54 17 * * ?" )
	public void doWork(){
		System.out.println("Hey let's see how many time you print me :"+i);
		System.out.println("System.currentTimeMillis :"+System.currentTimeMillis());
		System.out.println("Date and Time :"+new Date());
		//System.out.println("Calender instance:"+Calender.getInstance()); //JAVA 8
		//System.out.println("Calender instance:"+LocalDateTime.now()); //JAVA 8
		i++;
	}
}
