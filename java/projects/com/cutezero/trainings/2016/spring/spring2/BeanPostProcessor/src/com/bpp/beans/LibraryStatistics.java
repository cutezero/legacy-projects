package com.bpp.beans;

import java.util.concurrent.atomic.AtomicInteger;

public class LibraryStatistics {

	/** 
	 * The beanCount int is not thread safe 
	 * And we need to declare all methods as synchronize 
	 * and it effects in the performance of thread executions (little bit )
	 */
/*	public static int beanCount;
	public static synchronized int increment(){
		return beanCount++;
	}
*/	
	
	public static AtomicInteger instanceCounter;	//Thread-safe integer value
	public static AtomicInteger bookInstanceCounter;	//Thread-safe integer value
	public static AtomicInteger eBookInstanceCounter;	//Thread-safe integer value
	public static AtomicInteger videosInstanceCounter;	//Thread-safe integer value
	static{
		instanceCounter=new AtomicInteger(0);	//by default also it intialize from 0 value only
		bookInstanceCounter=new AtomicInteger(4);	//4 is the initial value Ex- already 4 book has provided off line
		eBookInstanceCounter=new AtomicInteger(0);
		videosInstanceCounter=new AtomicInteger(0);
	}
	public static void increment(){	// no need to be synchronized, beacause AtomicInteger is Thread safe
		instanceCounter.incrementAndGet();	//As it is Thread-safe component we can't directly increament by using '+' operator. Like instanceCounter++
	}
	public static int getInstanceCounterInt() {
		return instanceCounter.get();
	}
	public static void incrementBook(){	// no need to be synchronized, beacause AtomicInteger is Thread safe
		bookInstanceCounter.incrementAndGet();	//As it is Thread-safe component we can't directly increament by using '+' operator. Like instanceCounter++
	}
	public static int getBookCounterInt() {
		return bookInstanceCounter.get();
	}
	public static void incrementEBook(){	// no need to be synchronized, beacause AtomicInteger is Thread safe
		eBookInstanceCounter.incrementAndGet();	//As it is Thread-safe component we can't directly increament by using '+' operator. Like instanceCounter++
	}
	public static int getEBookCounterInt() {
		return eBookInstanceCounter.get();
	}
	public static void incrementVideos(){	// no need to be synchronized, beacause AtomicInteger is Thread safe
		videosInstanceCounter.incrementAndGet();	//As it is Thread-safe component we can't directly increament by using '+' operator. Like instanceCounter++
	}
	public static int getVideosCounterInt() {
		return videosInstanceCounter.get();
	}

	
	
}
