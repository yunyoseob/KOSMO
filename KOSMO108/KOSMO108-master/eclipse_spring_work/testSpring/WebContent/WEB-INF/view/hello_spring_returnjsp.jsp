<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1{
		background-color:blue;
		text-align:center;
		color:black;
	}
</style>
</head>
<body>
<h2 style="color:blue;">hello_spring_return.jsp 페이지 입니당!!</h2>
<hr>
<%
	Logger logger=LogManager.getLogger(this.getClass());
	logger.info("hello_spring_return.jsp 페이지 시작 ~!!");
	
	String kimStar=String.valueOf(request.getAttribute("kimStar"));
	logger.info("kimStar >>> : "+kimStar);
	// out.println("kimStar >>> : "+msgV);	
%>
<h1><%= kimStar %></h1>
</body>
</html>