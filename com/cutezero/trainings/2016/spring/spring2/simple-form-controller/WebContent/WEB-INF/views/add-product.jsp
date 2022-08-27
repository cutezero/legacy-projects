<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<h4>Add Product here</h4>
	
	<form:form action="do-add-product.action" >
	<form:errors path="*">
	</form:errors>
	<pre>
		Product Name : <form:input path="name"/>
		<br/>
		Category : <form:input path="category"/>
		<br/>
		Brand : <form:input path="brand"/>
		<br/>
		Price : <form:input path="price"/>
		<br/>
		<input type="submit" value="Add">
	</pre>
	</form:form>
	
</body>
</html>