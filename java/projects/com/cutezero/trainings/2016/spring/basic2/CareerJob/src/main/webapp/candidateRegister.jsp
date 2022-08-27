<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>

<html>	
	<head></head>
	<body>		
	<%-- <spring:form action="candidate_register.html" method="post" commandName="registerPerson">
	<table>
		<tr>
			<td>Username:</td>
			<td><spring:input path="uname" /></td>
			<td><font color='red'><spring:errors path="uname" /></font></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><spring:input path="email" /></td>
			<td><font color='red'><spring:errors path="email" /></font></td>
		</tr>
		<tr>
			<td>Age:</td>
			<td><spring:input path="age" /></td>
			<td><font color='red'><spring:errors path="age" /></font></td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td>
			<spring:radiobutton path="gender" value="MALE" label="MALE"/>
			<spring:radiobutton path="gender" value="FEMALE" label="FEMALE"/>
			</td>
			<td><font color='red'><spring:errors path="gender" /></font></td>
		</tr>
		<tr>
			<td>Birth Day(MM/dd/yyyy):</td>
			<td><spring:input path="birthday" /></td>
			<td><font color='red'><spring:errors path="birthday"/></font></td>
		</tr>
		<tr>
			<td>Country:</td>
			<td>
			<spring:select path="country">
			<spring:option value=""> --Select-- </spring:option>
			<spring:option value="INDIA">India</spring:option>
			<spring:option value="USA">USA</spring:option>
			<spring:option value="CHINA">China</spring:option>
			</spring:select>
			</td>
			<td><font color='red'><spring:errors path="country" /></font></td>
		</tr>		
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</spring:form> --%>
	
	
	<div align="left">
		Candidate's Register:<br />
		<form action="candidate_register.html" method="post">
			<table>
				<tr>
					<td><label>Username: </label></td>
					<td><input type="text" name="candidate_username" /></td>
				</tr>
				<tr>
					<td><label>Password: </label></td>
					<td><input type="password" name="candidate_password" /></td>
				</tr>
				<tr>
					<td><input type="reset" name="Reset"/></td>
					<td><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form>
	</div>
	${responseMessage }
	</body>
</html>