<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- JSTL core문을 사용하기 위해서는 반드시 문서 상단에 기술 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL_04</title>
</head>
<body>
<h3>JSTL 04</h3>
<hr>
<!-- jstl_04.jsp?num1=100&num2=50 -->
<!-- param : el 문법 : request.getParameter("num1") -->
첫 번째 수 : ${param.num1 }<br />
두 번째 수 : ${param.num2 }<br />
<br />
<%--
	<c:if test="조건식">실행문</c:if>
 --%>
 최댓값 :  <c:if test="${param.num1 - param.num2 > 0}">
 			${param.num1 }
 		</c:if>
 		<c:if test="${param.num1 - param.num2 < 0}">
 			${param.num2 }
 		</c:if>
<br />
 최솟값 : 	
<br /><c:if test="${param.num1 - param.num2 > 0}">${param.num2 }</c:if>
 		  <c:if test="${param.num1 - param.num2 < 0}">${param.num1 }</c:if>
</body>
</html>


