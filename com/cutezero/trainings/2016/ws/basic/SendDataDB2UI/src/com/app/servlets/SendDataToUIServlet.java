package com.app.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.utils.Cache;

/**
 * Servlet implementation class SendDataToUIServlet
 */
public class SendDataToUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Map<String, String> cities = null;
	Map<String, String> states = null;
	Map<String, String> countries = null;

	/**
	 * Default constructor.
	 */
	public SendDataToUIServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Cache cache = Cache.getInstance();
		if (cache.containskey("cities")) {
			cities = (Map<String, String>) cache.get("cities");
			states = (Map<String, String>) cache.get("states");
			countries = (Map<String, String>) cache.get("countries");
			System.out.println("Data obtained from Cache");
		} else {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:orcl", "scott",
						"tiger");

				System.out.println("Connection has been created");
				stmt = con.createStatement();
				rs = stmt.executeQuery("select * from tblcities");

				// List<String> cities=new ArrayList<String>();
				cities = new HashMap<String, String>();
				while (rs.next()) {
					cities.put(rs.getString(1), rs.getString(2));
				}
				rs.close();

				stmt = con.createStatement();
				rs = stmt.executeQuery("select * from tblstates");

				// List<String> states=new ArrayList<String>();
				states = new HashMap<String, String>();
				while (rs.next()) {
					states.put(rs.getString(1), rs.getString(2));
				}
				rs.close();

				stmt = con.createStatement();
				rs = stmt.executeQuery("select * from tblcountries");

				// List<String> countries=new ArrayList<String>();
				countries = new HashMap<String, String>();
				while (rs.next()) {
					countries.put(rs.getString("co_code"), rs.getString("co_name"));

				}
				rs.close();
				
				cache.put("cities", cities);
				cache.put("states", states);
				cache.put("countries", countries);

			} catch (SQLException | ClassNotFoundException e) {
				System.out.println("exception occured");
				e.printStackTrace();
			}

			finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		request.setAttribute("cities", cities);
		request.setAttribute("states", states);
		request.setAttribute("countries", countries);
		RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
