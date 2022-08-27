<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="LoanFinderServlet">
<pre>
	Name : <input type="text" name="name">
	Mobile : <input type="text" name="mobile">
	Email : <input type="text" name="email">
	Loan Amount : <input type="text" name="loanAmount">
	Tenure : <input type="text" name="tenure">
	Place : <select name="place">
	<option value="Hyd" selected="selected">HYD
	<option value="BAM">BAM
	<option value="BBSR">BBSR
	<option value="MUM" >MUM
	</select>
	
	<input type="submit" value="Submit">
</pre>
</form>
</body>
</html>