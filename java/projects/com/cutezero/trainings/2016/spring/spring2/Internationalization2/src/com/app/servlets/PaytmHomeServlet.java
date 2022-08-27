package com.app.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

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
		ResourceBundle rb=null;
		ResourceBundle rb2=null;
		String fileName=null;

		Locale locale= request.getLocale();
		String languageCode=locale.getLanguage();
		String countryCode= locale.getCountry();
		PrintWriter out=response.getWriter();
		out.println("Language Code : "+languageCode+" <br> "+"\n"+"Country code : "+ countryCode);
		out.println("Loacale : "+locale);
		
//		fileName="com/app/i18n/props/messages-"+locale+".properties";
		fileName="com/app/i18n/props/messages";
		rb=ResourceBundle.getBundle(fileName, Locale.getDefault());
		rb2=ResourceBundle.getBundle("com/app/i18n/props/errors", Locale.getDefault());
		String s1=rb.getString("home.header");
		String s2=rb2.getString("error.header");
		String baseBundleName=rb.getBaseBundleName();
		out.println("Base Bundle name:"+baseBundleName);
		out.println("home Header name:"+s1);
		out.println("error Header name:"+s2);

				
				
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
