<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${student.name} <br>
${student.age} <br>
${student["age"]}<br>
<%-- ${requestScoupe.student.name} --%>
<%-- ${sessionScoupe.student.name} --%>
<%-- ${applicationScoupe.student.name} --%>
${string[0]}<br>
${map["one"] }<br>
${map.two} <br>
${map.two > 0 } <br>
${cookie.JSESSIONID }
</body>
</html>