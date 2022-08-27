package com.hdfc.netbanking.util.locator;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.upi.upipayments2.service.UpiPayment;
import org.upi.upipayments2.service.UpiPaymentImplService;

public class UPIPaymentServiceLocator extends AbstractServiceLocator{

	private static UPIPaymentServiceLocator instance;
	
	private UPIPaymentServiceLocator() throws IOException {
		init();
	}

	public synchronized static UPIPaymentServiceLocator getInstance() throws IOException{
		if (instance==null)
			instance= new UPIPaymentServiceLocator();
		return instance;
	}

	public UpiPayment getUpiPaymentImplPort() throws MalformedURLException{
		String targetNamespace="http://www.upi.org/upiPayments2/service";
		
		
		//only with wsdl location with localhost address
/*		UpiPaymentImplService service= new UpiPaymentImplService();	
		System.out.println(service.getWSDLDocumentLocation());
		UpiPayment port= service.getUpiPaymentImplPort();
		return port;
*/		
		
		UpiPaymentImplService service= new UpiPaymentImplService(new URL(getWsdlLocation()), new QName(targetNamespace, "UpiPaymentImplService"));	
		UpiPayment port= service.getUpiPaymentImplPort();
		return port;
	}
}
