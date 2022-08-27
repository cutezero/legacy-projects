<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="doRegister" method="post">
Name: <input type="text" name="userName">
<br>
Email: <input type="text" name="userEmail">
<br>
Password: <input type="password" name="password">
<br>
City: <select name="city">
	<c:forEach items="${cities }" var="entry">
	<option value="${entry.value }">${entry.value }</option>
	</c:forEach>
</select>
<br>
State: <select name="state">
	<c:forEach items="${states }" var="state">
	<option value="${state.value }">${state.value}</option>
	</c:forEach>
</select>
<br>
Country: <select name="country">
	<c:forEach items="${countries }" var="country">
	<option value="${country.value }">${country.value }</option>
	</c:forEach>
</select>
<br>
<input type="submit" value="Save">
</form>

</body>
</html>