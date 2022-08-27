<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Mail sending App</h1>
<form action="MailServlet" method="post">
	<table>
		<tr>
			<td>To: </td><td><input type="text" name="to"></td></tr>
		<tr><td>Subject: </td><td><input type="text" name="subject"></td></tr>
		<tr><td>Content: </td><td><input type="text" name="content"></td></tr>
		<tr><td><input type="reset" value="Reset"></td><td><input type="submit" value="Send"></td></tr>
	</table>
</form>
	${msg }
</body>
</html>
