<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test_forward_4.jsp</title>
<link rel="stylesheet" href="/kosMember_YYS/css/yysColor.css">
</head>
<body>
<h3 style="background-color:#80aaff;">test_forward_4.jsp</h3>

<%
	String mid=request.getParameter("mid");
%>
<p style="background-color:#80aaff;"><%= mid %></p>
</body>
</html>