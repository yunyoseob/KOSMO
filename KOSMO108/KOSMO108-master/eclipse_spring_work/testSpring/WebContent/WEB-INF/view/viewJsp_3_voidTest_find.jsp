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
		background-color:green;
		text-align:center;
		color:black;
	}
</style>
</head>
<body>
<h2 style="color:green;">viewjsp_3_voidTest_find.jsp 페이지 입니당!!</h2>
<%
	Logger logger=LogManager.getLogger(this.getClass());
	logger.info("viewjsp2_modelandview_return_file.jsp 페이지 시작 ~!!");
%>
<h1>${mmmm }</h1>
</body>
</html>