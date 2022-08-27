

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		/*Messenger messenger= new Messenger();
		String msg=messenger.getMessage();
		out.println("Message : "+msg);*/
		Message2 message= new Message2();
		String msg=message.getMessage();
		out.println("Message : "+msg);
		out.println(AdminServlet.class.getClassLoader());
		
		
	}

}
