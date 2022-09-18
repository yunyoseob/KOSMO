<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test_forward_3</title>
<link rel="stylesheet" href="/kosMember_YYS/css/yysColor.css">
</head>
<body>
<h3 style="background-color:black;">test_forward_3</h3>
<%
	Logger logger=LogManager.getLogger(this.getClass());
	logger.info("test_forward_3.jsp 페이지 >>> : ");
	
	String mid_forward_singletag="yunyoseob";
	request.setAttribute("mid", mid_forward_singletag);
%>
<!-- 3. jsp : &lt;jsp:forward page="" /&gt;<br>  -->   
<jsp:forward page="/kos_jsp_p/test_forward_3_d.jsp"/>
</body>
</html>