package com.cfn;

public class ObserverImpl implements Observer1 {
	private String observerState= "New Observer";
	@Override
	public void updateState(Subject1 s1) {
		observerState= s1.getState();
	}

	@Override
	public void print() {
		System.out.println("observer's state is " +observerState);
	}

}
