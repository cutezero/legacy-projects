package com.cfn.amazon;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;

/**
 * Servlet implementation class AmazonServlet
 */

public class AmazonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public static Logger logger= Logger.getLogger(AmazonServlet.class);
	
	private ICourier courier;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AmazonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		logger.debug("May be I am the first logger");
		logger.info("I am 1st info message");
		
		String item=request.getParameter("item");
		String zip=request.getParameter("zip");
		
		courier= new BluedartCourier();
		String refNo= courier.doParcel(item, zip);
		logger.debug("May be I am the 2nd logger");
		logger.info("I am 2nd info message");
		System.out.println(refNo);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		logger.debug("May be I am the 3rd logger");
		logger.info("I am 3rd info message");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
