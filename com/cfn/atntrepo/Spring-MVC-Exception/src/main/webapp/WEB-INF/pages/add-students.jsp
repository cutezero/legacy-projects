<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Save Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
	<center>
	<h3>
		<a href="students">students</a> <a href="save-students">add
			students</a><br>
	</h3>
		<springForm:form action="add-students" method="POST"
			commandName="student">
			<table>
				<tr>
					<td>Name:</td>
					<td><springForm:input path="name" /></td>
					<td><springForm:errors path="name" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><springForm:input path="email" /></td>
					<td><springForm:errors path="email" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Phone:</td>
					<td><springForm:input path="phone" /></td>
					<td><springForm:errors path="phone" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><springForm:input path="address" /></td>
					<td><springForm:errors path="address" cssClass="error" /></td>
				</tr>
				<tr>
					<td colspan="3"><input type="submit" value="Save"></td>
				</tr>
			</table>

		</springForm:form>
	</center>
</body>
</html>





















