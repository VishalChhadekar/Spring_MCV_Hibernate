<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Singing</title>
</head>
<body>
	<h2>User Details</h2>
	Name: ${user.getName() }
	<br> Email: ${user.getEmail() }
	<br> Password: ${user.getPassword() }
	<br>
</body>
</html>