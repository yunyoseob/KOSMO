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
<h2 style="color:blue;">viewJsp_1_stringTest_return_file.jsp 페이지 입니당!!</h2>
<%
	Logger logger=LogManager.getLogger(this.getClass());
	logger.info("viewJsp_1_stringTest_return_file.jsp 페이지 시작 ~!!");
%>
<h1>${mdata }</h1>
view 페이지에 데이터 전달은 Model 인터페이스<br>
view 페이지 찾기는 함수의 String 리턴형 value를 이용<br>
</body>
</html>