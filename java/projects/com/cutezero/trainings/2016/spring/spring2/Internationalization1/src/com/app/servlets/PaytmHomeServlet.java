package com.app.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PaytmHomeServlet
 */
@WebServlet("/PaytmHomeServlet")
public class PaytmHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaytmHomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Properties properties= null;
		String fileName=null;

		Locale locale= request.getLocale();
		String languageCode=locale.getLanguage();
		String countryCode= locale.getCountry();
		PrintWriter out=response.getWriter();
		out.println("Language Code : "+languageCode+" <br> "+"\n"+"Country code : "+ countryCode);
		out.println("Loacale : "+locale);
		
		properties=new Properties();
		fileName="com/app/i18n/props/messages-"+locale+".properties";
		properties.load(this.getClass().getClassLoader().getResourceAsStream(fileName));
		String header=properties.getProperty("home.header");
		String footer=properties.getProperty("home.footer");
		out.println("<html>Header : "+header+"</html>");
		out.println(properties.getProperty("home.header"));
		out.println("<h3> footer: "+footer+"<h3>");

				
				
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
