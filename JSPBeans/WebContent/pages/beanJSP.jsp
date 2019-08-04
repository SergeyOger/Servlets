<%@page import="testproject.copy.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Using beans in JSP</title>
</head>
<body>
	<jsp:useBean id="person" class="testproject.copy.Person"
		scope=" " />
	<%
	    Person person2 = new Person();
	%>
	<jsp:setProperty property="name" name="person" value="person name" />
	<%
	    person2.setName("Test person");
	%>
	<jsp:getProperty property="name" name="person" />
	<%=person2.getName()%>
</body>
</html>