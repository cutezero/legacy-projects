package com.bl.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Rocket implements BeanFactoryAware, InitializingBean, DisposableBean{

	private int thresholdLimit;
	private int oxygenLevel;
	private int distance;
	
	
	public Rocket() {
		super();
	}
	
	public Rocket(int thresholdLimit) {
		this.thresholdLimit = thresholdLimit;
		System.out.println("Rocket() --constructor()");
	}
	
	public int getOxygenLevel() {
		return oxygenLevel;
	}
	
	public void setOxygenLevel(int oxygenLevel) {
		this.oxygenLevel = oxygenLevel;
		System.out.println("setOxygenLevel() --setter");
	}
	
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() Programettic Approach");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		distance=thresholdLimit* oxygenLevel;
		System.out.println("afterPropertiesSet() Programettic Approach");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory() --Aware Injectoin took place ");
	}

	public void inita(){
		thresholdLimit=35000;
		oxygenLevel=94;
		System.out.println("inita() -- configuration approach");
	}
	
	public void dump(){
		System.out.println("dump() -- configuration approach");
	}

	@Override
	public String toString() {
		return "Rocket [thresholdLimit=" + thresholdLimit + ", oxygenLevel=" + oxygenLevel + ", distance=" + distance
				+ "]";
	}
	
	
}
