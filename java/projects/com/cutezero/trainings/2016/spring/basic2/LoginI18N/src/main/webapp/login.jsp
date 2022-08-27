<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

Select your prefered Language:
<a href="login.form?p1=en">English</a>
||
<a href="login.form?p1=hi">&#2361;&#2367;&#2344;&#2381;&#2342;&#2367;</a>
||
<a href="login.form?p1=or">&#2835;&#2849;&#2879;&#2822;</a>


<center>
	<form:form action="check.form" method="POST" commandName="command">
		<spring:message code="label.username" />:
	<form:input path="uname" />
		<font color='red'><form:errors path="uname">
				<spring:message code="NotEmpty.command.uname" />
			</form:errors></font>
		<br />
		<spring:message code="label.password" />:
	<form:password path="pwd" />
		<font color='red'><form:errors path="pwd">
				<spring:message code="NotEmpty.command.pwd" />
			</form:errors></font>
		<br />
		<input type="submit" value="<spring:message code='value.submit'/>" />
	</form:form>
</center>