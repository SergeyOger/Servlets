<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User work bench</title>
</head>
<body>
	<jsp:useBean id="student" class="com.beans.Student">
		<p>
			Student name
			<%=student.getName()%>
		</p>
		<p>
			Student age
			<%=student.getAge()%></p>
	</jsp:useBean>
</body>
</html>