<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
</head>
<body>

	<h3 style="font: bold; font-family: serif; color: blue;">Recharge Dashboard Page</h3>
	<hr>
	<%-- <a href="${PageContext.request.contextPath }/search-plans.cfn">Search Plans</a> --%>	
	<a href="search-plans.cfn">Search Plans</a>	
	<hr>
	<p style="color: fuchsia;"> Click to view the Plans</p>
	<a href="plans.cfn?provider=jio">Jio</a>
	<a href="plans.cfn?provider=airtel">Airtel</a>
	<a href="plans.cfn?provider=vodafone">Vodafone</a>
	<a href="plans.cfn?provider=idea">Idea</a>
	<a href="plans.cfn?provider=bsnl">BSNL</a>
</body>
</html>