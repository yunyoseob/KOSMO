<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>    
<%
Logger logger=LogManager.getLogger(this.getClass());
logger.info("springEmpInsertForm.jsp 페이지입니다. >>> : ");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		alert("jQuery ready 함수 진입 >>>> : ");
		$(document).on("click", "#empbtn", function(){
			alert("EMP입력 버튼을 클릭하셨습니다 >>> : ");
			$("#formData").attr({
				"action":"springEmpInsert.yys",
				"method":"GET",
				"enctype":"application/x-www-form-urlencoded"
			}).submit();
		});
	});
</script>
</head>
<body>
<h3>springEmpInsertForm.jsp 페이지입니다.</h3>
<hr>
<form name="formData" id="formData">
<table border="2" align="center">
	<tr>
		<td colspan="2" class="align">EMP 입력</td>
	</tr>
	<tr>
		<td>사원번호</td>
		<td><input type="text" name="empno" id="empno" size="20"></td>
	</tr>
	<tr>
		<td>사원이름</td>
		<td><input type="text" name="ename" id="ename" size="20"></td>
	</tr>
	<tr>
		<td>입사일</td>
		<td><input type="text" name="hiredate" id="hiredate" size="20"></td>
	<tr>
		<td colspan="2">
			<button type="button" id="empbtn">EMP입력</button>			
		</td>
	</tr>
</table>
</form>
</body>
</html>