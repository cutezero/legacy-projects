<!-- success.jsp -->

<!-- 
	<%
	Object o=request.getAttribute("msg");
	String str=(String)o;
	out.println("<h1> "+str+"</h1>");
	%>
 -->
<h1>${requestScope.msg }</h1>