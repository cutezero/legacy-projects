//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.11 at 06:34:41 AM GMT-12:00 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import generated.CardType;
import generated.CollegeType;
import generated.CourseType;
import generated.CoursesType;
import generated.LocationType;
import generated.ObjectFactory;
import generated.PaymentInfoType;
import generated.StaffsType;
import generated.StudentsType;
import generated.TeachingStaffType;
import generated.UniversityType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _University_QNAME = new QName("", "university");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UniversityType }
     * 
     */
    public UniversityType createUniversityType() {
        return new UniversityType();
    }

    /**
     * Create an instance of {@link StaffsType }
     * 
     */
    public StaffsType createStaffsType() {
        return new StaffsType();
    }

    /**
     * Create an instance of {@link StudentsType }
     * 
     */
    public StudentsType createStudentsType() {
        return new StudentsType();
    }

    /**
     * Create an instance of {@link TeachingStaffType }
     * 
     */
    public TeachingStaffType createTeachingStaffType() {
        return new TeachingStaffType();
    }

    /**
     * Create an instance of {@link CourseType }
     * 
     */
    public CourseType createCourseType() {
        return new CourseType();
    }

    /**
     * Create an instance of {@link CoursesType }
     * 
     */
    public CoursesType createCoursesType() {
        return new CoursesType();
    }

    /**
     * Create an instance of {@link CollegeType }
     * 
     */
    public CollegeType createCollegeType() {
        return new CollegeType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link CardType }
     * 
     */
    public CardType createCardType() {
        return new CardType();
    }

    /**
     * Create an instance of {@link PaymentInfoType }
     * 
     */
    public PaymentInfoType createPaymentInfoType() {
        return new PaymentInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniversityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "university")
    public JAXBElement<UniversityType> createUniversity(UniversityType value) {
        return new JAXBElement<UniversityType>(_University_QNAME, UniversityType.class, null, value);
    }

}
