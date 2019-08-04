<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new user</title>
</head>
<body>

	<form action="/MyController" method="post">
		<p>
			<label for="userName">User name</label>
		</p>
		<p>
			<input id="userName" type="text" placeholder="user name">
		</p>
		<p>
			<label for="userAge">User age</label>
		</p>
		<p>
			<input id="userAge" type="number" placeholder="user age">
		</p>
		<input type="submit" value="Submit">
	</form>

</body>
</html>