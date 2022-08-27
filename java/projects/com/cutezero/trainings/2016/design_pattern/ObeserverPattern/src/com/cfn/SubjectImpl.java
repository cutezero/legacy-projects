package com.cfn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubjectImpl implements Subject1 {
	private String state="Hello";
	private List al= new ArrayList();
	@Override
	public String getState() {
		return state;
	}

	@Override
	public void addObserver(Observer1 o) {
		al.add(o);

	}

	@Override
	public void removeObserver(Observer1 o) {
		al.remove(o);

	}

	@Override
	public void notifyObservers() {
		Iterator i= al.iterator();
		while(i.hasNext())
		{
			Observer1 o=(Observer1)i.next();
			o.updateState(this);
		}
	}

	@Override
	public void print() {
		System.out.println("Subject state is: "+getState());
	}

	@Override
	public void setState(String state) {
		this.state=state;
		notifyObservers();
		
	}
}
