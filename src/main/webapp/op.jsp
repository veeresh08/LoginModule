<%@page import="com.logging.Mylogger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page errorPage="error_exceptions.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int a=0,b=0,c=0; %>  
  <%
    String n1 = request.getParameter("n1");
  	String n2 = request.getParameter("n2");
  	
 		
  			a = Integer.parseInt(n1);
  			b = Integer.parseInt(n2);
  	  	  	c = a/b;
  	
  
  %>
  
  <h2>result is : <%=c %></h2>
  
</body>
</html>