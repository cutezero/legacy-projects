package com.cfn.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import javax.sql.PooledConnection;


import oracle.jdbc.pool.OracleConnectionPoolDataSource;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mobileNumber=request.getParameter("mobileNumber");
		String password=request.getParameter("password");
		
		String sql="insert into users2 values(?,?,?,?)";
		
		try {
			OracleConnectionPoolDataSource dataSource= new OracleConnectionPoolDataSource();
			dataSource.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
			dataSource.setUser("scott");
			dataSource.setPassword("tiger");
			
			PooledConnection pooledConnection= dataSource.getPooledConnection();
			Connection connection= pooledConnection.getConnection();
			PreparedStatement statement= connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, email);
			statement.setLong(3, Long.parseLong(mobileNumber));
			statement.setString(4, password);
//			boolean i=statement.execute();
			int i=statement.executeUpdate();
			 if (i==1){
				 System.out.println("Data submission Success");
			 }else{
				 
				 System.out.println("Data submission Failure");
			 }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("There is problem in submiiting your data");
			e.printStackTrace();
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.err.println("You have entered wrong input to a Number field");
		} 		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
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
