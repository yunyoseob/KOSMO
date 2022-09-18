<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test_forward_3_d</title>
<link rel="stylesheet" href="/kosMember_YYS/css/yysColor.css">
</head>
<body>
<h3 style="background-color:#e6b3cc">test_forward_3_d</h3>
<%
	Logger logger=LogManager.getLogger(this.getClass());
	logger.info("test_forward_3_d.jsp 페이지 >>> : ");
	
	
	// String mid=request.getParameter("mid");
	Object obj=request.getAttribute("mid");
	logger.info("test_forward_3_d.jsp :: obj >>> : "+obj);
	String mid=(String)obj;
	logger.info("test_forward_3_d.jsp :: mid >>> : "+mid);
%>
<p style="background-color:#e6b3cc"><%= mid %></p>
</body>
</html>