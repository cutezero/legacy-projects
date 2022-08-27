<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1><u>Recomonded mobile list</u></h1>
  
  <table border="1">
   <tr>
     <th>mobile</th>
     <th>price</th>
     <th>camera</th>
     <th>simtype</th>
   </tr>
   <c:forEach items="${mob}" var="mob">
    <tr>
      <td><c:out value="${mob.getMobile()}" /></td>
      <td><c:out value="${mob.getPrice()}" /></td>
      <td><c:out value="${mob.getCamera()}" /></td>
      <td><c:out value="${mob.getSimType()}" /></td>
    </tr>
   </c:forEach>
  </table>
</body>
</html>