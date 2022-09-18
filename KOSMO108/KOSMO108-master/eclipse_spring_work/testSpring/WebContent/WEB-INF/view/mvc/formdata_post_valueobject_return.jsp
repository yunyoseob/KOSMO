<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>formdata_post_valueobject_return.jsp 페이지 입니당</h3>
<%
	Logger logger=LogManager.getLogger(this.getClass());
	logger.info("formdata_post_valueobject_return.jsp 페이지 입니당 >>> : ");
%>
<!-- Controller에서 참조변수로 객체를 인스턴스한 것을 jsp에서 EL로 출력시킨다. -->
EL 표현식으로 데이터 추출하기 : <br>
${formDataVO.datanum }
${formDataVO.dataid }
${formDataVO.datapw }
${formDataVO.dataname }
<hr>
EL 표현식 및 객체함수로 데이터 추출하기 : <br>
${formDataVO.getDatanum() } <br>
${formDataVO.getDataid() } <br>
${formDataVO.getDatapw() } <br>
${formDataVO.getDataname() } <br>
</body>
</html>