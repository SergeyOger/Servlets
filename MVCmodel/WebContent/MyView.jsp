<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="Student" class="com.beans.Student" scope="request"></jsp:useBean>
<%-- 	<jsp:useBean id="Student" class="com.beans.Student" scope="session"></jsp:useBean> --%>
<%-- 	<jsp:useBean id="Student" class="com.beans.Student" scope="application"></jsp:useBean> --%>

<jsp:getProperty property="name" name="Student"/>
</body>
</html>