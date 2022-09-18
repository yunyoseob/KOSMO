<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>    
<%
	Logger logger=LogManager.getLogger(this.getClass());
	logger.info("index.jsp 페이지 입니다 >>>  :");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Spring FrameWork + Mybatis Framwork</h3>
<hr>
<a href="springEmpInsertForm.yys">springEmp 입력 테스트</a><br>
<a href="springEmpSelectAll.yys">springEmp 전체 조회 테스트</a><br>
<a href="springEmpSelectForm.yys">springEmp 조건 조회 테스트</a><br>
<a href="springEmpUpdatForm.yys">springEmp 수정 테스트</a><br>
</body>
</html>