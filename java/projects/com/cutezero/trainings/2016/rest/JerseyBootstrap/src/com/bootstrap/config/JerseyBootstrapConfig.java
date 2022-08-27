package com.bootstrap.config;

import org.glassfish.jersey.server.ResourceConfig;

import com.bootstrap.resources.MessageReciever;
import com.bootstrap.resources.sub.MessageTranslator;

public class JerseyBootstrapConfig extends ResourceConfig{

	public JerseyBootstrapConfig() {
		super.register(new MessageReciever());
		super.register(new MessageTranslator());
		
	}

	
}
