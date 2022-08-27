package com.cfn.app;

import java.io.IOException;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/insert")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static int id=1;
    /**
     * Default constructor. 
     */
    public MainServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con=null;
		PreparedStatement pstmt=null;
		PreparedStatement pstmt2=null;
		PreparedStatement pstmt3=null;
		int i,id2,id3;
		String msg=null;
		try {
			System.out.println("Execution Started");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver class loaded");
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection created");
			
			//select an id value from sequence created in Oracle
			//String sql2="select test1_sequence.nextval from dual";
			//pstmt2= con.prepareStatement(sql2);
			//ResultSet rs2 = pstmt2.executeQuery();
			//rs2.next();
			//id2=rs2.getInt(1);
			//System.out.println("sequence logic executed");
			//System.out.println("sequence (id) :"+id2);
			
			//select an max Id already in the DB
			String sql3="select max(eid1) from test1";
			pstmt3= con.prepareStatement(sql3);
			ResultSet rs3 = pstmt3.executeQuery();
			rs3.next();
			id3=rs3.getInt(1);
			System.out.println("max of ID logic executed");
			System.out.println("max (id) :"+id3);
			
			//inserting into DB
			String sql="insert into test1 values(?,?,?)";			
			pstmt= con.prepareStatement(sql);
			//pstmt.setInt(1, id);//as a static integer increment
			//pstmt.setInt(1, id2);
			id3++;
			pstmt.setInt(1, id3); //by selecting max (id) value
			pstmt.setString(2, request.getParameter("name"));
			pstmt.setString(3, request.getParameter("name2"));
			
			i = pstmt.executeUpdate();
			System.out.println(i+" rows inserted successfully");
			msg="rows inserted successfully";
			
			
			con.close();
		} catch (SQLException e) {
			System.err.println("Execution Problem");
			msg="rows not inserted successfully";
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Class not loaded");
			msg="rows not inserted successfully2";
			e.printStackTrace();
		}
		finally{
			request.setAttribute("msg", msg);
			request.setAttribute("timestamp", new Date());
	            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
	            dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
