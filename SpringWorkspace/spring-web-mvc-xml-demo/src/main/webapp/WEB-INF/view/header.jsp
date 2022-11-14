<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.time.LocalDate" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<header>
		<h3 style="text-align:right">
			<%= LocalDate.now() %>
		</h3>
		<h1 style="border-bottom: 1px solid black">My First Spring Web MVC Application</h1>
	</header>
	<nav>
		<a href="home">Home</a>
	</nav>
</body>
</html>