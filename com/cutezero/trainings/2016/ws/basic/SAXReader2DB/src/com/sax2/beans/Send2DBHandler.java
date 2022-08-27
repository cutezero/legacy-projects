package com.sax2.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.sax2.test.SRTest;


public class Send2DBHandler extends DefaultHandler{

	private PreparedStatement statement;
	private Connection connection;
	private String recentElement;
	private String itemCode;
	private int quantity;
	public PreparedStatement getStatement() {
		return statement;
	}

	public void setStatement(PreparedStatement statement) {
		this.statement = statement;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public String getRecentElement() {
		return recentElement;
	}

	public void setRecentElement(String recentElement) {
		this.recentElement = recentElement;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	private double price;
	private double invoicePrice;
	
	public double getInvoicePrice() {
		return invoicePrice;
	}

	public void setInvoicePrice(double invoicePrice) {
		this.invoicePrice = invoicePrice;
	}

	public double getPriceFormDB(String itemCode) throws ClassNotFoundException{
		double itemPrice=0;
		try {
				//connect to database
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
				PreparedStatement statement=connection.prepareStatement("select item_price from item_2 where item_id=?");
				statement.setString(1, itemCode);
				ResultSet result=statement.executeQuery();
				
				while(result.next()){
					
					itemPrice=result.getDouble(1);
				}
				//System.out.println(" item Price : "+itemPrice);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return itemPrice;
	}
	
	public void startDocument() throws SAXException {
		System.out.println("Documnet reading started ...");
		recentElement=null;
		//getDBConnection();
	}

	public void startElement(String arg0, String arg1, String arg2,
			Attributes arg3) throws SAXException {
		recentElement=arg2;
	}

	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
			if (recentElement!=null && recentElement.equals("itemCode")){
				itemCode=new String(arg0, arg1,arg2);
			}
			if (recentElement!=null && recentElement.equals("quantity")){
				quantity= Integer.parseInt(new String(arg0, arg1, arg2));
			}
	}


	double totalPrice=0;
	public void endElement(String arg0, String arg1, String arg2)
			throws SAXException {
		
		if (recentElement!=null && recentElement.equals("quantity")){
			int quantity=getQuantity();
			try {
				price=new Send2DBHandler().getPriceFormDB(getItemCode());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("item code : "+itemCode+ " quantity : "+quantity+"price : "+price);
			System.out.println("Total Price = "+(quantity*price));
			totalPrice=quantity*price;
			invoicePrice=invoicePrice+totalPrice;
		}
		recentElement=null;
	}


	
	public void endDocument() throws SAXException {
		/*try {
			if (connection!=null)
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("Total Invoice Bill : "+ invoicePrice);
		System.out.println("Documnet end reached");
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
