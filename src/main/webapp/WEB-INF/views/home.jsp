<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
	<h1>Home page</h1>
	<h2>Managed by home-controller</h2>
	<% String name =(String)request.getAttribute("name"); %>
	<%=name %>

</body>
</html>