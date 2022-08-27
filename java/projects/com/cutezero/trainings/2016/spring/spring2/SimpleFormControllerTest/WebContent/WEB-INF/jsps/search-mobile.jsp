<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form:form action="mobile.htm" method="post">
  <p style="color: red;">
   <form:errors path="*" />
  </p>
	<pre>
	  Mobile Brand : <form:input path="brand" /><br/>
	  Min price    : <form:input path="minPrice" /><br/>
	  max price    : <form:input path="maxPrice" /><br/>
			         <input type="submit" value="search" />
    </pre>
  </form:form>
</body>
</html>