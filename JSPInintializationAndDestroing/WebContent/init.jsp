<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Init JSP</title>
</head>
<body>

	<%!public void jspInit() {
		System.out.println("initialize jsp");
	};

	public void jspDestroy() {

		System.out.println("destroy jsp");
	}%>

</body>
</html>