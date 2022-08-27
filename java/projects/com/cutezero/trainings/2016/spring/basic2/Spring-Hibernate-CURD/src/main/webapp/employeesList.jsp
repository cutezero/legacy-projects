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
	<h1>List Of Employees</h1>

	<h3>
		<a href="add.html">Add more Employee</a>
	</h3>

	<c:if test="${!empty employees }">

		<table>
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Age</th>
				<th>Employee Address</th>
				<th>Employee Salary</th>
			</tr>

			<c:forEach items="${employees }" var="employee">
				<tr>
					<td><c:out value="${employee.empId }" /> </td>
					<td><c:out value="${employee.empName }" /> </td>
					<td><c:out value="${employee.empAge }" /> </td>
					<td><c:out value="${employee.salary }" /> </td>
					<td><c:out value="${employee.empAddress }" /> </td>
					<td align="center">
					<a href="edit.html?id=${employee.empId }">Edit</a> | <a href="delete.html?id=${employee.empId }">Delete</a> </td>
				</tr>
			</c:forEach>
		</table>

	</c:if>


</body>
</html>
