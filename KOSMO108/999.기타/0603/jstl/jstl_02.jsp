<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- JSTL core문을 사용하기 위해서는 반드시 문서 상단에 기술 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL_02</title>
</head>
<body>
<h3>JSTL 02</h3>
<hr>
<!-- JSTL core 변수를 선언한 후 jstl_03.jsp로 넘기자 : forward() -->
<c:set var="code" value="abc001" scope="request" />
<c:set var="name" value="컴퓨터" scope="request" />
<c:set var="price" value="5000000" scope="request" />
<jsp:forward page="jstl_03.jsp" />
</body>
</html>