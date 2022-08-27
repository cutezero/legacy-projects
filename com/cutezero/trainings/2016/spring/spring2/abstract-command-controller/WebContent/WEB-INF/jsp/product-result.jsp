<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Result</title>
</head>
<body>
	<h3>Your Search criteria results as follows</h3>
	
	<table>
		<tr bgcolor="yellow">
			<td>Name</td>
			<td>Category</td>
			<td>Brand</td>
			<td>Amount</td>
		</tr>
	<c:forEach items="${productsResult }" var="product">
		<tr>
			<td><c:out value="${product.name }"/></td>
			<td><c:out value="${product.category }"/></td>
			<td><c:out value="${product.brand }"/></td>
			<td><c:out value="${product.price }"/></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>