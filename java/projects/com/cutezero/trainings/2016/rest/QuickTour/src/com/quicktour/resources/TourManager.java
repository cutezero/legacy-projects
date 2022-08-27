package com.quicktour.resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.quicktour.dto.NewPackage;
import com.quicktour.dto.PackageInfo;

@Path("/tour")
public class TourManager {
	private Map<String, PackageInfo> userPackages;
	PackageInfoStreamingOutput pisOutput=null;
	NewPackage nPackage= null;
	
	public TourManager() {
		userPackages= new ConcurrentHashMap<>();
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput createNewPackage(InputStream in) throws SAXException, IOException, ParserConfigurationException {
		PackageInfo packageInfo= null;
		nPackage= newPackageReader(in);
		packageInfo= new PackageInfo();
		packageInfo.setOrderId(UUID.randomUUID().toString());
		packageInfo.setPackageName(nPackage.getPackageName());
		packageInfo.setAmount(1239.90f);
		packageInfo.setComments("Package has been processed");
		packageInfo.setStatus("ACTIVE");
		
		//store in the DB(which is similar to a Map)
		userPackages.put(packageInfo.getOrderId(), packageInfo);
		
		pisOutput= new PackageInfoStreamingOutput(packageInfo);
		return pisOutput;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput getPackageName(@QueryParam("order-id")String orderId) {
		PackageInfo packageInfo= null;
		if (userPackages.containsKey(orderId)) {
			packageInfo=userPackages.get(orderId);
		}
		pisOutput= new PackageInfoStreamingOutput(packageInfo);
		return pisOutput;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput updatePackage(InputStream in) throws SAXException, IOException, ParserConfigurationException {
		PackageInfo packageInfo= null;
		nPackage= newPackageReader(in);
		if (userPackages.containsKey(nPackage.getExistingOrderId())) {
			packageInfo=userPackages.get(nPackage.getExistingOrderId());
			packageInfo.setPackageName(nPackage.getPackageName());
			packageInfo.setAmount(9089.78f);
			packageInfo.setComments("Package has been upgraded.");
			packageInfo.setStatus("ACTIVE");
			userPackages.put(packageInfo.getOrderId(), packageInfo);
		}else{
			packageInfo= new PackageInfo();
			packageInfo=userPackages.get(nPackage.getExistingOrderId());
			packageInfo.setPackageName(nPackage.getPackageName());
			packageInfo.setAmount(0);
			packageInfo.setComments("Package details not found.");
			packageInfo.setStatus("NOT FOUND");
		}
		pisOutput= new PackageInfoStreamingOutput(packageInfo);
		return pisOutput;
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput cancelPackage(InputStream in, @QueryParam("order-id")String orderId) {
		PackageInfo packageInfo= null;
		if (userPackages.containsKey(orderId)) {
			packageInfo=userPackages.remove(orderId);
			packageInfo.setOrderId(orderId);
			packageInfo.setAmount(4567);
			packageInfo.setComments("Package has been cancelled. Amount will be refunded in 48 hrs ");
			packageInfo.setStatus("CANCELLED");
			
			pisOutput= new PackageInfoStreamingOutput(packageInfo);
		}
		return pisOutput;
	}
	
	private NewPackage newPackageReader(InputStream in) throws SAXException, IOException, ParserConfigurationException {
		Document doc= null;
		DocumentBuilder builder= null;
		DocumentBuilderFactory dFactory= null;
		String nodeName= null;
		String nodeValue= null;
		
		nPackage= new NewPackage();
		
		dFactory= DocumentBuilderFactory.newInstance();
		builder= dFactory.newDocumentBuilder();
		doc= builder.parse(in);
		
		Node rootNode= doc.getFirstChild();
		NodeList children= rootNode.getChildNodes();
		for(int i=0;i<children.getLength(); i++) {
			Node child=children.item(i);
			nodeName= child.getNodeName();
//			nodeValue= child.getNodeValue();	//not working
			nodeValue=child.getTextContent();
			
			System.out.println("Node name : "+nodeName+" Node value : "+nodeValue);
			switch (nodeName) {
			case "package-name":
				nPackage.setPackageName(nodeValue);
			case "package-id":
				nPackage.setPackageId(nodeValue);
			case "existing-order-id":
				nPackage.setExistingOrderId(nodeValue);
				System.out.println("Request for Upgradation "+nodeValue);
			case "person-name":
				nPackage.setPersonName(nodeValue);
			case "mobile-no":
				nPackage.setMobileNo(nodeValue);
			case "email-id":
				nPackage.setEmailId(nodeValue);

			default:
				break;
			}
		}
		return nPackage;
	}
	
	private final class PackageInfoStreamingOutput implements StreamingOutput{
		PackageInfo packageInfo;
		
		public PackageInfoStreamingOutput(PackageInfo packageInfo) {
			super();
			this.packageInfo = packageInfo;
		}

		@Override
		public void write(OutputStream out) throws IOException, WebApplicationException {
		
			StringBuffer buffer= null;
			buffer=new StringBuffer();
			buffer.append("<package-info>")
			.append("<order-id>").append(packageInfo.getOrderId()).append("</order-id>");
			if (packageInfo.getPackageName() != null) {
				buffer.append("<package-name>").append(packageInfo.getPackageName()).append("</package-name>");
			}
			if (packageInfo.getAmount() != 0) {
				buffer.append("<amount>").append(packageInfo.getAmount()).append("</amount>");
			}
			if (packageInfo.getComments()!= null) {
				buffer.append("<comments>").append(packageInfo.getComments()).append("</comments>");
			}
			if (packageInfo.getStatus()!= null) {
				buffer.append("<status>").append(packageInfo.getStatus()).append("</status>");
			}
			buffer.append("</package-info>");
			out.write(buffer.toString().getBytes());
			out.close();
		}
		
	}
}
