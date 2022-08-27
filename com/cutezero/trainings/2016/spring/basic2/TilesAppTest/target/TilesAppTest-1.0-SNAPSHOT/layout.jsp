<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
	<body>
		<table cellpadding="2" cellspacing="2" align="center">
			<tr>
			<td height="25%" colspan="2">
			<tiles:insertAttribute name="header"/></td></tr>
			
			<tr>
			<td height="25%" >
			<tiles:insertAttribute name="menu"/></td>
			
			<td height="75%" >
			<tiles:insertAttribute name="body"/></td></tr>
			
			<tr>
			<td height="15%" colspan="2">
			<tiles:insertAttribute name="footer"/></td></tr>	
		</table>
	</body>
</html>