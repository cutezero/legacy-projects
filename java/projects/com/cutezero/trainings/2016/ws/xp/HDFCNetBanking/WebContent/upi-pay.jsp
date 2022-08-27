<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UPI Payment</title>
</head>
<body>

	<form action="UPIPayServlet" method="post">
		<table>
			<tr>
				<td>From account :</td>
				<td><input type="text" name="fromAc" /></td>
			</tr>
			<tr>
				<td>To Account : </td>
				<td><input type="text" name="toAc" /></td>
			</tr>
			<tr>
				<td>Amount : </td>
				<td><input type="text" name="amount" /></td>
			</tr>
			<tr>
				<td>Remarks: </td>
				<td><input type="text" name="remarks" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Pay" /></td>
			</tr>
		</table>
	</form>
</body>
</html>