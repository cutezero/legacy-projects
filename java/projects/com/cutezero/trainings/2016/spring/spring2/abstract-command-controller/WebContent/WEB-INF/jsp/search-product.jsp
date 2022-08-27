<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Product</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/do-search-product.mvc" method="post">
	Product Name : <input type="text" name="name"/>
	<br/>
	Catagory : <input type="text" name="category"/>
	<br/>
	Brand : <input type="text" name="brand"/>
	<br/>
	Min Price : <input type="text" name="minPrice"/>
	<br/>
	Max Price : <input type="text" name="maxPrice"/>
	<br/>
	<input type="submit" value="Search">
	</form>
</body>
</html>