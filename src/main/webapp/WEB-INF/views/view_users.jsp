<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View all Users</title>
</head>
<body>
	<h2>User list</h2>
	<c:forEach var="item" items="${allUsers}">
	Name: ${item.name}<br>
	Email: ${item.email}<br>
	Password: ${item.password}<br>
	</c:forEach>

</body>
</html>