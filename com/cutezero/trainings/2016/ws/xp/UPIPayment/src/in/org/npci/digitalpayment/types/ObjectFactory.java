
package in.org.npci.digitalpayment.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import in.org.npci.digitalpayment.types.ObjectFactory;
import in.org.npci.digitalpayment.types.Reciept;
import in.org.npci.digitalpayment.types.UpiAccount;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.org.npci.digitalpayment.types package. 
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

    private final static QName _Amount_QNAME = new QName("http://www.npci.org.in/digitalPayment/types", "amount");
    private final static QName _FromAccount_QNAME = new QName("http://www.npci.org.in/digitalPayment/types", "from-account");
    private final static QName _ToAccount_QNAME = new QName("http://www.npci.org.in/digitalPayment/types", "to-account");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.org.npci.digitalpayment.types
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
     * Create an instance of {@link UpiAccount }
     * 
     */
    public UpiAccount createUpiAccount() {
        return new UpiAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.npci.org.in/digitalPayment/types", name = "amount")
    public JAXBElement<Double> createAmount(Double value) {
        return new JAXBElement<Double>(_Amount_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpiAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.npci.org.in/digitalPayment/types", name = "from-account")
    public JAXBElement<UpiAccount> createFromAccount(UpiAccount value) {
        return new JAXBElement<UpiAccount>(_FromAccount_QNAME, UpiAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpiAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.npci.org.in/digitalPayment/types", name = "to-account")
    public JAXBElement<UpiAccount> createToAccount(UpiAccount value) {
        return new JAXBElement<UpiAccount>(_ToAccount_QNAME, UpiAccount.class, null, value);
    }

}
