package com.billdesk.resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.StreamingOutput;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.billdesk.dto.CardDetails;
import com.billdesk.dto.MerchantPaymentRequest;
import com.billdesk.dto.TransactionReciept;

@Path("/master")
public class BilldeskMasterProvider implements BilldeskProvider {

	/*
	 * This app is not working. Need to be reviewed
	 * (non-Javadoc)
	 * @see com.billdesk.resources.BilldeskProvider#pay(java.io.InputStream)
	 */
	@Override
	public StreamingOutput pay(InputStream in) {
		return new StreamingOutput() {

			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {

				MerchantPaymentRequest paymentInfo= null;
				TransactionReciept reciept=null;
				StringBuilder builder = null;
				
				try {
					paymentInfo=paymentInfoInputstreamReader(in);
					reciept= new TransactionReciept();
					reciept.setOrderId(paymentInfo.getOrderId());
					reciept.setTransactionId(UUID.randomUUID().toString().substring(1, 8));
					reciept.setOrderAmount(paymentInfo.getOrderAmount());
					reciept.setPaymentType(paymentInfo.getPaymentType());
					reciept.setStatus("Succes");

					builder=new StringBuilder();
					builder.append("<transaction>")
					.append("<order-id>").append(reciept.getOrderId()).append("</order-id>")
					.append("<transaction-id>").append(reciept.getTransactionId()).append("</transaction-id>")
					.append("<order-amount>").append(reciept.getOrderAmount()).append("</order-amount>")
					.append("<payment-type>").append(reciept.getPaymentType()).append("</payment-type>")
					.append("<status>").append(reciept.getStatus()).append("</status>")
					.append("</transaction>");
					out.write(builder.toString().getBytes());
					out.close();
				} catch (SAXException | ParserConfigurationException e) {
					e.printStackTrace();
				}
			}
		};
	}

	public MerchantPaymentRequest paymentInfoInputstreamReader(InputStream in)
			throws SAXException, IOException, ParserConfigurationException {
		Document doc = null;
		DocumentBuilder builder = null;
		DocumentBuilderFactory builderFactory = null;
		Node rootNode = null;
		NodeList paymentInfoChildren = null;
		Node paymentInfoChild = null;
		String nodeName = null;
		String nodeValue = null;
		MerchantPaymentRequest paymentInfo = null;
		CardDetails cardDetails = null;
		NodeList cardDetailsChildren = null;
		Node cardDetailsChild = null;
		String cardChildNodeName = null;
		String cardChildNodeValue = null;

		builderFactory = DocumentBuilderFactory.newInstance();
		builder = builderFactory.newDocumentBuilder();
		doc = builder.parse(in);

		rootNode = doc.getFirstChild();
		paymentInfoChildren = rootNode.getChildNodes();

		paymentInfo = new MerchantPaymentRequest();
		cardDetails = new CardDetails();
		for (int i = 0; i < paymentInfoChildren.getLength(); i++) {
			paymentInfoChild = paymentInfoChildren.item(i);
			nodeName = paymentInfoChild.getNodeName();
			nodeValue = paymentInfoChild.getTextContent();
			
			System.out.println("Node Name : "+nodeName);
			System.out.println("Node Value : "+nodeValue);
			
			switch (nodeName) {
			case "merchant-payment-request":
				// Don't do anything for rootNode
			case "merchant-id":
				paymentInfo.setMerchantId(nodeValue);
			case "order-id":
				paymentInfo.setOrderId(nodeValue);
			case "order-amount":
				try {
				paymentInfo.setOrderAmount(Double.parseDouble(nodeValue));
				}catch(NumberFormatException e) {
					paymentInfo.setOrderAmount(9090);					
				}
			case "payment-type":
				paymentInfo.setPaymentType(nodeValue);
			case "card-details":
				cardDetailsChildren = paymentInfoChild.getChildNodes();
				for (int j = 0; j < cardDetailsChildren.getLength(); i++) {
					cardDetailsChild = cardDetailsChildren.item(j);
					cardChildNodeName = cardDetailsChild.getNodeName();
					cardChildNodeValue = cardDetailsChild.getTextContent();

					switch (cardChildNodeName) {
					case "card-number":
						cardDetails.setCardNumber(cardChildNodeValue);
					case "card-type":
						cardDetails.setCardType(cardChildNodeValue);
					case "name-on-card":
						cardDetails.setNameOnCard(cardChildNodeValue);
					case "expiry-year":
						cardDetails.setExpiryYear(Integer.parseInt(cardChildNodeValue));
					case "expiry-month":
						cardDetails.setExpiryMonth(Integer.parseInt(cardChildNodeValue));
					case "cvv-number":
						cardDetails.setExpiryMonth(Integer.parseInt(cardChildNodeValue));
					default:
						break;
					}
					paymentInfo.setCardDetails(cardDetails);
				}
			default:
				break;
			}
		}
		return paymentInfo;
	}

}
