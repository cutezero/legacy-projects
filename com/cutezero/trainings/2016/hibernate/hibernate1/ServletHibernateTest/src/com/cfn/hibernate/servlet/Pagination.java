package com.cfn.hibernate.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cfn.hibernate.dao.EmployeeDao;
import com.cfn.hibernate.dao.EmployeeDaoFactory;
import com.cfn.hibernate.model.Employee;



/**
 * Servlet implementation class Pagination
 */
@WebServlet("/Pagination")
public class Pagination extends HttpServlet {
    private EmployeeDao dao;   
        public Pagination() {
        super();
        // TODO Auto-generated constructor stub
    }
        public void init(ServletConfig config){
        	dao=EmployeeDaoFactory.getInstance();
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read pageNumber
        	int pageNumber=Integer.parseInt(request.getParameter("pageNumber"));
        	int start= pageNumber*3-3;
        	List list=dao.getEmployeeList(start);
        	response.setContentType("text/html");
        	PrintWriter out=response.getWriter();
        	out.println("<center><table border=3>");
        	out.println("<tr><th>EMP No</th><th>EMP Name</th><th>Salary</th><th>Dept No</th></tr>");
        	Iterator it= list.iterator();
        	while (it.hasNext())
        	{
        		Employee e=(Employee)it.next();
        		out.println("<tr><td>"+e.getEmpNumber()+"</td><td>"+e.getEmpName()+"</td><td>"+e.getEmpSalary()+"</td><td>"+e.getDeptNumber()+"</td></tr>");
        	}
        	out.println("</table>");
        	int count=dao.getEmployeeCount();
        	int pages=count/3;
        	if (count>pages*3)
        	{
        		pages++;
        	}
        	for (int i=1;i<=pages;i++)
        	{
        		out.println("<b><a href=Pagination?pageNumber="+i+">"+i+"</a></b>");
        		out.println("&nbsp; &nbsp; &nbsp; &nbsp;");
        	}
        	out.println("</center>");
        	out.close();
        }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
