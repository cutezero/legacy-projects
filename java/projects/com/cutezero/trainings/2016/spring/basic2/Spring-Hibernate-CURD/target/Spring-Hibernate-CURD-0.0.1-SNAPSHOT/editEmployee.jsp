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
        
        <h2>Add Employee data</h2>
	<form action="save.html" method="post">
		<table>
			<tr>
				<td>Employee Id:</td>
				<td bgcolor="grey"><input type="text" name="empno" value=<%=request.getAttribute("eid") %> readonly="true" /></td>
			</tr>

			<tr>
				<td>Employee Name:</td>
				<td><input type="text" name="empname"></td>
			</tr>

			<tr>
				<td>Employee Age:</td>
				<td><input type="text" name="empage"></td>
			</tr>

			<tr>
				<td>Employee Salary:</td>
				<td><input type="text" name="empsalary"></td>
			</tr>

			<tr>
				<td>Employee Address:</td>
				<td><input type="text" name="empaddress"></td>
			</tr>

			<tr>
				<td><input type="reset" name="RESET"></td>
				<td><input type="submit" name="SUBMIT"></td>
			</tr>

		</table>
	</form>
        
    </body>
</html>
