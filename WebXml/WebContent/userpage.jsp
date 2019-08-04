<%@ page
	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello User</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String secondName = request.getParameter("secindName");
	%>
	<p>Hello <%=name + " " + secondName%></p>
</body>
</html>