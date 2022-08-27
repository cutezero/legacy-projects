
package net.webservicex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.webservicex package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SMSResult_QNAME = new QName("http://www.webserviceX.NET", "SMSResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.webservicex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendSMSToIndia }
     * 
     */
    public SendSMSToIndia createSendSMSToIndia() {
        return new SendSMSToIndia();
    }

    /**
     * Create an instance of {@link SMSResult }
     * 
     */
    public SMSResult createSMSResult() {
        return new SMSResult();
    }

    /**
     * Create an instance of {@link SendSMSToIndiaResponse }
     * 
     */
    public SendSMSToIndiaResponse createSendSMSToIndiaResponse() {
        return new SendSMSToIndiaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMSResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webserviceX.NET", name = "SMSResult")
    public JAXBElement<SMSResult> createSMSResult(SMSResult value) {
        return new JAXBElement<SMSResult>(_SMSResult_QNAME, SMSResult.class, null, value);
    }

}
