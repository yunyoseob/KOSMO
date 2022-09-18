<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="a.b.c.test.UrlSource" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>URL 소스 출력하기</title>
</head>
<body>

<%
	String url=request.getParameter("inputurl");
	
	UrlSource u=new UrlSource(url);

%>

&lt; %= url % &gt; -> <%= url %>

</body>
</html>