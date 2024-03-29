// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package in.co.irctc.web.provider;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;

public class IRCTCServiceSIE_getTicketPrice_ResponseStruct_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_result_QNAME = new QName("", "result");
    private static final javax.xml.namespace.QName ns3_double_TYPE_QNAME = SchemaConstants.QNAME_TYPE_DOUBLE;
    private CombinedSerializer ns3_myns3__double__double_Double_Serializer;
    private static final int myRESULT_INDEX = 0;
    
    public IRCTCServiceSIE_getTicketPrice_ResponseStruct_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns3_myns3__double__double_Double_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, double.class, ns3_double_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        in.co.irctc.web.provider.IRCTCServiceSIE_getTicketPrice_ResponseStruct instance = new in.co.irctc.web.provider.IRCTCServiceSIE_getTicketPrice_ResponseStruct();
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_result_QNAME)) {
                member = ns3_myns3__double__double_Double_Serializer.deserialize(ns1_result_QNAME, reader, context);
                instance.setResult(((Double)member).doubleValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("soap.unexpectedElementName", new Object[] {ns1_result_QNAME, elementName});
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        in.co.irctc.web.provider.IRCTCServiceSIE_getTicketPrice_ResponseStruct instance = (in.co.irctc.web.provider.IRCTCServiceSIE_getTicketPrice_ResponseStruct)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        in.co.irctc.web.provider.IRCTCServiceSIE_getTicketPrice_ResponseStruct instance = (in.co.irctc.web.provider.IRCTCServiceSIE_getTicketPrice_ResponseStruct)obj;
        
        ns3_myns3__double__double_Double_Serializer.serialize(new Double(instance.getResult()), ns1_result_QNAME, null, writer, context);
    }
    protected void verifyName(XMLReader reader, javax.xml.namespace.QName expectedName) throws java.lang.Exception {
    }
}
