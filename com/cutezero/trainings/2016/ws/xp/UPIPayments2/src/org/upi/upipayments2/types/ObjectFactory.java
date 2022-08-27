
package org.upi.upipayments2.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
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

    private final static QName _FromAccount_QNAME = new QName("http://www.upi.org/upiPayments2/types", "from-account");
    private final static QName _Amount_QNAME = new QName("http://www.upi.org/upiPayments2/types", "amount");
    private final static QName _ToAccount_QNAME = new QName("http://www.upi.org/upiPayments2/types", "to-account");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.upi.upipayments2.types
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

    /**
     * Create an instance of {@link UpiAccount }
     * 
     */
    public UpiAccount createUpiAccount() {
        return new UpiAccount();
    }

    /**
     * Create an instance of {@link Reciept }
     * 
     */
    public Reciept createReciept() {
        return new Reciept();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpiAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.upi.org/upiPayments2/types", name = "from-account")
    public JAXBElement<UpiAccount> createFromAccount(UpiAccount value) {
        return new JAXBElement<UpiAccount>(_FromAccount_QNAME, UpiAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.upi.org/upiPayments2/types", name = "amount")
    public JAXBElement<Double> createAmount(Double value) {
        return new JAXBElement<Double>(_Amount_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpiAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.upi.org/upiPayments2/types", name = "to-account")
    public JAXBElement<UpiAccount> createToAccount(UpiAccount value) {
        return new JAXBElement<UpiAccount>(_ToAccount_QNAME, UpiAccount.class, null, value);
    }

}
