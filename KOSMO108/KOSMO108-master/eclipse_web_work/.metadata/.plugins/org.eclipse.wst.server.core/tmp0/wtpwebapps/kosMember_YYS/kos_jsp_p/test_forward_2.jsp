<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>       
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test_forward_2</title>
<link rel="stylesheet" href="/kosMember_YYS/css/yysColor.css">
</head>
<body>
<h3 style="background-color:black;">test_forward_2</h3>
<%
	Logger logger=LogManager.getLogger(this.getClass());
	logger.info("test_forward_2.jsp 페이지 >>> : ");
	
	String mid_pagecontext="yunyoseob";
	
	// 2. jsp : pageContext.forward();
	pageContext.forward("/kos_jsp_p/test_forward_2_d.jsp?mid="+mid_pagecontext);
%>
</body>
</html>