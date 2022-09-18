<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test_forward_1_d</title>
<link rel="stylesheet" href="/kosMember_YYS/css/yysColor.css">
</head>
<body>
<h3 style="background-color:#ff80bf">test_forward_1_d</h3>
<%
	Object obj=request.getAttribute("mid");
	String mid=(String)obj;
%>
<p style="background-color:#ff80bf"><%= mid %></p>
</body>
</html>