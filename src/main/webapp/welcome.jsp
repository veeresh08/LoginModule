<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding numberes</title>
</head>
<body>

<%

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}

	
	
%>

Welcome ${username}
<a href="videos.jsp">for Exception handling</a>

<form action="Logout">
	
	<input type = "submit" value="Logout">
	
</form>


</body>
</html>