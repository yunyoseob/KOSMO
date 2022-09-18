<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VELOG_2</title>
<style type="text/css">
	h3, p{
		height:100px;
		width:150px;
		margin:10px auto;
	}
</style>
</head>
<body>
<h3 style="background-color:blue;">VELOG_2</h3>
<%
	String s1=request.getParameter("s");
%>
<p style="background-color:blue;"><%= s1 %></p>
</body>
</html>