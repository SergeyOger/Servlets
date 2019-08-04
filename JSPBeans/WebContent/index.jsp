<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ol>
		<%=LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))%>
		<li><a href="pages/courses.jsp">Registration</a></li>
		<li><a>Some other page</a></li>
		<li><a>And one more</a></li>
	</ol>

	<input type="number" name="num1">
	<input type="number" name="num2">

	<%@ include file="pages/courses.jsp"%>
	<jsp:include page="pages/courses.jsp"></jsp:include>
	<jsp:forward page="/pages/forwardjspexample.jsp"></jsp:forward>
</body>
</html>