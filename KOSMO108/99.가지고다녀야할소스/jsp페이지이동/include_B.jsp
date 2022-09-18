<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INCLUDE_B</title>
</head>
<body>
<h3  style="background-color: cyan;">INCLUDE_B JSP</h3>
<hr>
<%
	String mid = request.getParameter("mid");	
	String mpw = request.getParameter("mpw");
	String param_3 = request.getParameter("param_3");	
	String param_4 = request.getParameter("param_4");
	
	out.println("include_B mid >>> : " + mid + "<br>");
	out.println("include_B mpw  >>> : " + mpw + "<br>");
	out.println("include_B param_3 >>> : " + param_3 + "<br>");
	out.println("include_B param_4  >>> : " + param_4 + "<br>");
	
	System.out.println("include_B mid >>> : " + mid);
	System.out.println("include_B mpw  >>> : " + mpw);
	System.out.println("include_B param_3 >>> : " + param_3);
	System.out.println("include_B param_4  >>> : " + param_4);
%>
</body>
</html>