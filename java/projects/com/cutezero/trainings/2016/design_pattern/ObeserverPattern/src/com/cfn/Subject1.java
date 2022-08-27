package com.cfn;

public interface Subject1 {
	void setState(String state);
	String getState();
	void addObserver(Observer1 o);
	void removeObserver(Observer1 o);
	void notifyObservers();
	void print();
}
