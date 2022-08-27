
package com.cfn.app;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cfn.app package. 
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

    private final static QName _ShowMsg_QNAME = new QName("http://app.cfn.com/", "showMsg");
    private final static QName _ShowMsgResponse_QNAME = new QName("http://app.cfn.com/", "showMsgResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cfn.app
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowMsgResponse }
     * 
     */
    public ShowMsgResponse createShowMsgResponse() {
        return new ShowMsgResponse();
    }

    /**
     * Create an instance of {@link ShowMsg }
     * 
     */
    public ShowMsg createShowMsg() {
        return new ShowMsg();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.cfn.com/", name = "showMsg")
    public JAXBElement<ShowMsg> createShowMsg(ShowMsg value) {
        return new JAXBElement<ShowMsg>(_ShowMsg_QNAME, ShowMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowMsgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.cfn.com/", name = "showMsgResponse")
    public JAXBElement<ShowMsgResponse> createShowMsgResponse(ShowMsgResponse value) {
        return new JAXBElement<ShowMsgResponse>(_ShowMsgResponse_QNAME, ShowMsgResponse.class, null, value);
    }

}
