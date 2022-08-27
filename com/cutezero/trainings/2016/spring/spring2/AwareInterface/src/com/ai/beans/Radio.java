package com.ai.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Radio implements BeanFactoryAware {

	
	public Radio() {
		System.out.println("Radio () const...");
	}

	private BeanFactory beanFactory;
	protected IReciever reciever;

	public String play(float frequency) {
		if (frequency > 0 && frequency <= 100) {
			reciever = beanFactory.getBean("lowFrequencyReciever", IReciever.class);
		} else {
			reciever = beanFactory.getBean("highFrequencyReciever", IReciever.class);
		}
		reciever.transmit(frequency);
		return reciever.recieve();
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		this.beanFactory = arg0;
		System.out.println("setBeanFactory() ");
	}
}
