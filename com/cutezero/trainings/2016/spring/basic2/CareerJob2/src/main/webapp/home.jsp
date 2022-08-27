<html>
<head></head>
<body>
	<div style="width: 90%; overflow: hidden;">
		<div style="width: 310px; float: left;">
			Candidate's Login:<br />
			<form action="candidate_login.html">
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
						<td><a href="candidate_forgot_password.html"><input
								type="button" value="Fogot Password"></a></td>
						<td><input type="submit" value="Login" /></td>
					</tr>
				</table>
			</form>
			<label>New Candidate can </label><a href="candidateRegister.jsp">Register
				here</a>
		</div>
		<div style="margin-left: 300px;">
			Recruiter's Login:<br />
			<form action="recruiter_login.html">
				<table>
					<tr>
						<td><label>Username: </label></td>
						<td><input type="text" name="recruiter_username" /></td>
					</tr>
					<tr>
						<td><label>Password: </label></td>
						<td><input type="password" name="recruiter_password" /></td>
					</tr>
					<tr>
						<td><a href="recruiter_forgot_password.html"><input
								type="button" value="Fogot Password"></a></td>
						<td><input type="submit" value="Login" /></td>
					</tr>
				</table>
			</form>
			<label>New Consultant can </label><a href="consultantRegister.jsp">Register
				here</a>
		</div>
		
	</div>
</body>
</html>