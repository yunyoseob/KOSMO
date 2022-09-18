<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
 body{
 	height:300px;
 	width:500px;
 	left:50%;
 	right:50%;
	text-align:center;
 }

</style>
</head>
<body>
<h3>JSP 파일에서 출력하기</h3>
<p>결과물 출력하기</p>
<img src="/kosMember_YYS2/image/KakaoTalk_20220425_123529653.gif" alt="image가 안 나와요"/>
<hr>
<%
	String mid=request.getParameter("mid");
	String mpw=request.getParameter("mid");
	out.println("mid >>> : "+mid+"<br>");
	out.println("mpw >>> : "+mpw);
%>
</body>
</html>