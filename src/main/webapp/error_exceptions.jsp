<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Something went wrong</title>
</head>
<body>
	<h1>Sorry ! something went wrong</h1>
	<p><%=exception %>
	<a href="videos.jsp" >Go back</a>
</body>
</html>