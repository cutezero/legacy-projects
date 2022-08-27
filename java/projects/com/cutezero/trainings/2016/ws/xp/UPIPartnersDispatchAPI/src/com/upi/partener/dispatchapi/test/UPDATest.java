package com.upi.partener.dispatchapi.test;

import java.io.IOException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.Service.Mode;
import javax.xml.ws.soap.SOAPBinding;


public class UPDATest {

	public static void main(String[] args) throws SOAPException, IOException {
		final String SERVICE_NS="http://www.upi.org/upiPayments2/service";
		final String TYPE_NS="http://www.upi.org/upiPayments2/types";
		final QName serviceName= new QName(SERVICE_NS,"UpiPaymentImplService");
		final QName portName= new QName(SERVICE_NS, "UpiPaymentImplPort");
		final String endpointAddress="http://localhost:8080/UPIPayments2/upiPay";
		
		Service upiGatewayService= Service.create(serviceName);
		upiGatewayService.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING, endpointAddress);
		
		Dispatch<SOAPMessage> upiDispatch= upiGatewayService.createDispatch(portName, SOAPMessage.class, Mode.MESSAGE);
		//upiDispatch.invoke();
		
		MessageFactory factory=MessageFactory.newInstance();
		SOAPMessage requestMessage= factory.createMessage();
		
		SOAPBody body= requestMessage.getSOAPBody();
		SOAPElement rootSendMoneyElement= body.addChildElement(new QName(TYPE_NS, "sendMoney"));
		//from account part
		SOAPElement fromAcElement= rootSendMoneyElement.addChildElement(new QName(TYPE_NS, "from-account"));
		SOAPElement fromVpaElemnet= fromAcElement.addChildElement(new QName(TYPE_NS, "vpa"));
		SOAPElement fromIfscElemnet= fromAcElement.addChildElement(new QName(TYPE_NS, "ifsc"));
		SOAPElement fromAcNameElemnet= fromAcElement.addChildElement(new QName(TYPE_NS, "account-holder-name"));
		
		fromVpaElemnet.addTextNode("Srikanta@sbi");
		fromIfscElemnet.addTextNode("SBIN13633");
		fromAcNameElemnet.addTextNode("Srikanta Panigrahy");
		
		//to account part
		SOAPElement toAcElement= rootSendMoneyElement.addChildElement(new QName(TYPE_NS, "to-account"));
		SOAPElement toVpaElemnet= toAcElement.addChildElement(new QName(TYPE_NS, "vpa"));
		SOAPElement toIfscElemnet= toAcElement.addChildElement(new QName(TYPE_NS, "ifsc"));
		SOAPElement toAcNameElemnet= toAcElement.addChildElement(new QName(TYPE_NS, "account-holder-name"));
		
		toVpaElemnet.addTextNode("Bisu@upi");
		toIfscElemnet.addTextNode("DNBA89089");
		toAcNameElemnet.addTextNode("Biswanath Pradhan");
		
		//Amountpart
		SOAPElement amountElement= rootSendMoneyElement.addChildElement(new QName(TYPE_NS, "amount"));
		amountElement.addTextNode("4500");
//		requestMessage.writeTo(System.out);	//to see the soapMessage on console o/p
		
		SOAPMessage responseMessage= upiDispatch.invoke(requestMessage);
		responseMessage.writeTo(System.out);	
		

/*		SOAPBody responseBody=responseMessage.getSOAPBody();
		Iterator childs=responseBody.getChildElements();
		System.out.println(childs);
//		for(SOAPElement child: childs)
		while(childs.hasNext()){
			SOAPElement child=(SOAPElement)childs.next();
			System.out.println(child.getNodeValue());
		}
*/
	}
}
