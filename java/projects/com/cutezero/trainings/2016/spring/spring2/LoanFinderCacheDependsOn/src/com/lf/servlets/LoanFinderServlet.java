package com.lf.servlets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lf.util.Cache;
import com.lf.util.cache.helper.CacheManager;
import com.lf.util.cache.helper.IAccessor;

/**
 * Servlet implementation class LoanFinderServlet
 */
@WebServlet("/LoanFinderServlet")
public class LoanFinderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoanFinderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=null;
		String mobile=null;
		String email=null; 
		String place=null;
		double loanAmount=0;
		int tenure=0;
		double intrestRate=0;
		
		Cache cache=null;
		CacheManager cacheManager=null;
		
		name=request.getParameter("name");
		mobile=request.getParameter("mobile");
		email=request.getParameter("email");
		loanAmount=Double.parseDouble(request.getParameter("loanAmount"));
		tenure=Integer.parseInt(request.getParameter("tenure"));
		place=request.getParameter("place");

		PrintWriter out=response.getWriter();
		Properties properties= new Properties();
		out.println("----------Test Data(Direct access from Properties file)------------");
		/**
		 * We can write in several ways to get the path up to the WEB-INF folder by following ways
		 * Then we can append or pass the rest of the path to get the properties file
		 */
//		properties.load(request.getServletContext().getResourceAsStream("/WEB-INF/place-interest.properties"));
//		properties.load(this.getServletContext().getResourceAsStream("/WEB-INF/place-interest.properties"));
//		properties.load(this.getClass().getClassLoader().getResourceAsStream("/WEB-INF/place-interest.properties"));
//		String s=request.getServletContext().getRealPath("/WEB-INF/place-interest.properties");
		
		properties.load(new FileInputStream(this.getServletContext().getRealPath("/WEB-INF/place-interest.properties")));
		intrestRate=Double.parseDouble(properties.getProperty(place));
		out.println("Name : "+name+"\n "+"Mobile : "+mobile+"\n "+"email : "+email+"\n "+"place : "+place);
		out.println("loanAmount : "+loanAmount+"\n "+"Tenure : "+tenure);
		out.println("Interest Rate is : "+intrestRate);
		System.out.println("Interest Rate is : "+intrestRate);
		out.println("--------------Test Data(Ends here)------------");
		
		out.println("--------------From Cache ------------");
		/**
		 * Here we can check, verify, load and get data from/to cache
		 * 
		 * However this method is not recommended as per the industry standard
		 * To make over it, we do use Cache Manager and Accessor Class to decouple all the logic written inside this class
		 */
		/*cache= Cache.getInstance();
		if (!cache.containsKey(place)){
			properties.load(new FileInputStream(this.getServletContext().getRealPath("/WEB-INF/place-interest.properties")));
			cache.put(KEY_Place_IR, properties);
		}
		System.out.println("Not Exist in cache");
		properties=(Properties)cache.get(KEY_Place_IR);
		intrestRate= Double.parseDouble(properties.getProperty(place));
		*/
		out.println("--------------From Cache (Ends here)------------");
		
		out.println("--------------From CacheManager ------------");
		
		cacheManager=new CacheManager();
		cacheManager.load();
		cache= Cache.getInstance();
		properties=(Properties)(cache).get(IAccessor.KEY_PLACE_RI);
		System.out.println(properties.get(place));
		intrestRate= Double.parseDouble(properties.getProperty(place));
		
		
		
		/*cache= Cache.getInstance();
		properties=(Properties)cache.get(IAccessor.KEY_PLACE_RI);
		System.out.println(properties.get(place));
		intrestRate= Double.parseDouble(properties.getProperty(place));
		 */
		out.println("--------------From CacheManager (Ends here)------------");
		
		System.out.println("------------Output-------------");
		out.println("Name : "+name+"\n "+"Mobile : "+mobile+"\n "+"email : "+email+"\n "+"place : "+place);
		out.println("loanAmount : "+loanAmount+"\n "+"Tenure : "+tenure);
		out.println("Interest Rate is : "+intrestRate);
		System.out.println("Interest Rate is : "+intrestRate);
		
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
