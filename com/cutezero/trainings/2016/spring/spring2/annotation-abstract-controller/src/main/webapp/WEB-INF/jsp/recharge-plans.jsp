<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Plans</title>
</head>
<body>
	<h3>Recharge Plans</h3>
	<hr>
	<p style="font: italic; color: gray;">The plans might changes time
		to time. Please be sure with your operator before recharging any plans</p>
	<c:forEach items="${plans}" var="plan">
	<div>
		<span>
		</span>
		<span>
		Plan :
		${plan.planName }
		</span>
		<br/>
		<span>
		Price to pay: ${plan.rechargePrice }
		</span>
		<br/>
		<span>
		Balance credited : ${plan.rechargeValue }
		</span>
		<br/>
		<span>
		Validity: ${plan.validity }
		</span>
		<br/>
		<span>
		More Info: ${plan.moreInfo }
		</span>
		<br/>
		<br/>
	</div>

	
	</c:forEach>
</body>
</html>