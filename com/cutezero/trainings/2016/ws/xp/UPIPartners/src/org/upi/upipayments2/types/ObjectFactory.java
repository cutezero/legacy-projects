
package org.upi.upipayments2.types;

import javax.xml.bind.annotation.XmlRegistry;
import org.upi.upipayments2.types.ObjectFactory;
import org.upi.upipayments2.types.Reciept;
import org.upi.upipayments2.types.SendMoney;
import org.upi.upipayments2.types.SendMoneyResponse;
import org.upi.upipayments2.types.UpiAccount;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.upi.upipayments2.types package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.upi.upipayments2.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Reciept }
     * 
     */
    public Reciept createReciept() {
        return new Reciept();
    }

    /**
     * Create an instance of {@link SendMoney }
     * 
     */
    public SendMoney createSendMoney() {
        return new SendMoney();
    }

    /**
     * Create an instance of {@link UpiAccount }
     * 
     */
    public UpiAccount createUpiAccount() {
        return new UpiAccount();
    }

    /**
     * Create an instance of {@link SendMoneyResponse }
     * 
     */
    public SendMoneyResponse createSendMoneyResponse() {
        return new SendMoneyResponse();
    }

}
