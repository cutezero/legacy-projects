<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Plans by Filter</title>
</head>
<body>
	<h3>Search plans by filter</h3>
	<hr/>
	<%-- <form action="${PageCOntext.request.contextPath }/get-plans.cfn" > --%>
	<form action="get-plans.cfn" >
	<pre>
		Plan Name : <input type="text" name="planName">
		Type : 
		<input type="radio" name="planType" value="prepaid" >Prepaid
		<input type="radio" name="planType" value="postpaid" >Postpaid
		Provider Name : <select name="providerName">
			<option>Jio</option>
			<option>Airtel</option>
			<option>Vodafone</option>
			<option>Idea</option>
			<option>BSNL</option>
		</select>
		Validity: <input type="text" name="validity">
		Amount: <input type="text" name="amount">
		<br/>
		<input type="submit" value="Search">
	</pre>
	</form>
</body>
</html>