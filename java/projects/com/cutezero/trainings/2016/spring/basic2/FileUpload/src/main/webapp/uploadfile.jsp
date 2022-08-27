<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<body>
		<center>
		<h1>
			<c:if test="${message ne null}">
			<c:out value="${message}"></c:out>
			</c:if>
		</h1>
		<hr>
		<form action="upload.do" method="post" enctype="multipart/form-data">
			Choose only XML type only: <input type="file" name="file1">
			<input type="submit" value="UPLOAD">
		</form>
		</center>
	</body>
</html>