<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
%>


<div align=center><br><br>
	<h1>enter number</h1>
	
	<form action="op.jsp" method="post">
		enter num 1 : <input type= "text" name ="n1"><br><br>
		enter num 2 :<input type = "text" name="n2"><br><br>
		<input type ="submit" value="Devide">
		<input type ="reset" value="reset">
	</form>
	</div>
	
	

</body>
</html>