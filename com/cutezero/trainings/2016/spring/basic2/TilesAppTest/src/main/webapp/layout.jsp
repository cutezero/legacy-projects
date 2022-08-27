<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
	<body>
		<table border="1" width="90%" height="90%" cellpadding="20" cellspacing="2" align="center">
			<tr>
			<td height="25%" colspan="2">
			<tiles:insertAttribute name="header"/></td></tr>
			
			<tr>
			<td width="2o%" >
			<tiles:insertAttribute name="menu"/></td>
			
			<td width="80%" >
			<tiles:insertAttribute name="body"/></td></tr>
			
			<tr>
			<td height="15%" colspan="2">
			<tiles:insertAttribute name="footer"/></td></tr>	
		</table>
	</body>
</html>