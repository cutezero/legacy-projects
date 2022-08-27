
package in.org.npci.digitalpayment.service;

import javax.xml.bind.annotation.XmlRegistry;
import in.org.npci.digitalpayment.service.ObjectFactory;
import in.org.npci.digitalpayment.service.SendMoney;
import in.org.npci.digitalpayment.service.SendMoneyResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.org.npci.digitalpayment.service package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.org.npci.digitalpayment.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMoney }
     * 
     */
    public SendMoney createSendMoney() {
        return new SendMoney();
    }

    /**
     * Create an instance of {@link SendMoneyResponse }
     * 
     */
    public SendMoneyResponse createSendMoneyResponse() {
        return new SendMoneyResponse();
    }

}
