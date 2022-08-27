package com.hdfc.netbanking.util.locator;

import java.io.IOException;
import java.util.Properties;

public abstract class AbstractServiceLocator {

	protected String wsdlLocation;
	protected String wsdlKey;
	protected String serviceName;
	protected Properties endpointProperties;
	String envValue=null;
	String ServiceNameKey;
	
	
	public String getEnv(){
		if(endpointProperties.containsKey("netbanking.env")){
			envValue=endpointProperties.getProperty("netbanking.env");
		}
		return envValue;
	}
	public String getWsdlLocation(){
		wsdlKey="netbanking."+getEnv()+".wsdlURL";
		if(endpointProperties.containsKey(wsdlKey)){
			wsdlLocation=endpointProperties.getProperty(wsdlKey);
		}
		return wsdlLocation;
	}
	public String getServiceName(){
		ServiceNameKey="netbanking."+getEnv()+".serviceName";	//may not work till now, this part need to reviewd   
		if(endpointProperties.containsKey(ServiceNameKey)){
			serviceName=endpointProperties.getProperty(ServiceNameKey);
		}
		serviceName="UpiPaymentImplService";
		return serviceName;
	}
	
	public void init() throws IOException{
		endpointProperties= new Properties();
		endpointProperties.load(this.getClass().getClassLoader().getResourceAsStream("com/hdfc/netbanking/resources/endpoint.properties"));
	}
}
