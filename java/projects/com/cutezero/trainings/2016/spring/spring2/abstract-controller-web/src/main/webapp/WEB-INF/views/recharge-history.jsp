<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >

<title>Recharge History</title>
</head>
<body>

	<p>This is Recharge history section of our Application</p>
	
	<table border="1" cellspacing="0" bordercolor="red">
		<tr>
			<th>Order ID</th>
			<th>Mobile No</th>
			<th>Amount</th>
			<th>Date</th>
			<th>Status</th>
		</tr>
		<c:forEach var="rechargeDetail" items="${rechargeDetails }"> 
			<tr bgcolor="yellow" >
			
				<td><c:out value="${rechargeDetail.getOrderId() }"/></td>
				<td><c:out value="${rechargeDetail.getMobileNo() }"/></td>
				<td><c:out value="${rechargeDetail.getAmount() }"/></td>
				<td><c:out value="${rechargeDetail.getRechargeDate() }"/></td>
				<td><c:out value="${rechargeDetail.getStatus() }"/></td>				
			<%-- 
				<td>${rechargeDetail.orderId }</td>
				<td>${rechargeDetail.mobileNo }</td>
				<td>${rechargeDetail.amount }</td>
				<td>${rechargeDetail.date }</td>
				<td>${rechargeDetail.status }</td>
				 --%>
			</tr>
		</c:forEach>
	</table>
</body>
</html>