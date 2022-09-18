<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test_forward_1</title>
<link rel="stylesheet" href="/kosMember_YYS/css/yysColor.css">
</head>
<body>
<h3 style="background-color:black">test_forward_1</h3>
<% 
	Logger logger=LogManager.getLogger(this.getClass());
	logger.info("test_forward_1.jsp 페이지 >>> : ");
	// test_forward_1.jsp 페이지 >>> : 
	
	String mid="yunyoseob";
	logger.info("test_forward_1.jsp :: mid >>> : "+mid);
	
	request.setAttribute("mid", mid);
	RequestDispatcher rd=request.getRequestDispatcher("/kos_jsp_p/test_forward_1_d.jsp");
	rd.forward(request, response);
%>
</body>
</html>