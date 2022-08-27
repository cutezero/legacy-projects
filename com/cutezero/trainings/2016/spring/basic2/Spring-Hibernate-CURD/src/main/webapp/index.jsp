<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <c:if test="${message ne null }">
        <c:out value="${message }">
        </c:out>
        </c:if>
        <h2>Spring4MVC with Hibernate3 CRUD Example</h2>
        1.<a href="employees.html">List Employees</a>
        2.<a href="add.html">Add Employee</a>
    </body>
</html>
