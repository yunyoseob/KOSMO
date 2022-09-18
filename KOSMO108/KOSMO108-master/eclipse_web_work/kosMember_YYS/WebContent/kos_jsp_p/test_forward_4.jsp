<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test_forward_4</title>
<link rel="stylesheet" href="/kosMember_YYS/css/yysColor.css">
</head>
<body>
<h3 style="background-color:#80aaff">test_forward_4</h3>

<%
	Logger logger=LogManager.getLogger(this.getClass());
	logger.info("test_forward_4.jsp 페이지 >>> : ");
	
	String mid="yunyoseob";
%>
<jsp:forward page="/kos_jsp_p/test_forward_4_d.jsp">
	<jsp:param name="mid" value="<%= mid %>" />
</jsp:forward>

</body>
</html>