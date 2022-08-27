package com.annote.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Manufacturer {
	@Inject
	private Computer computer;
	@Resource
	private Mobile smartPhone;
	@Override
	public String toString() {
		return "Manufacturer [computer=" + computer + ", smartPhone=" + smartPhone + "]";
	}
	
	@PostConstruct
	public void start(){
		System.out.println(" This is an init()");
	}

	@PreDestroy
	public void stop(){
		System.out.println(" This is an detroy()");
	}

}
