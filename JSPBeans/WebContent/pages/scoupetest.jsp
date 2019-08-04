<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="testproject.copy.Person"></jsp:useBean>
	<jsp:getProperty property="name" name="person" />

</body>
</html>