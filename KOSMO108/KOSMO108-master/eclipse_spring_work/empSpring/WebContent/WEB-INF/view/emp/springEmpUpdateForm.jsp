<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>    
<%
	Logger logger=LogManager.getLogger(this.getClass());
	logger.info("springEmpUpdat.jsp 페이지 입니당 >>> : ");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		alert("jQuery ready 함수 진입 >>> : ");
		$(document).on("click", "#updateBtn", function(){
			alert("EMP_수정 버튼을 클릭하셨습니다. >>> : ");
			$("#springEmpUpdate").attr({
				"action":"springEmpUpdate.yys",
				"method":"GET",
				"enctype":"application/x-www-form-urlencoded"
			}).submit();
		});
	});
</script>
</head>
<body>
<h3>springEmpUpdateForm.jsp</h3>
<hr>
<form name="springEmpUpdate" id="springEmpUpdate">
<table border="1" class="align">
	<tr>
		<td colspan="2" class="align">EMP 수정</td>				
	</tr>
	<tr>
		<td class="align">사원번호</td>		
		<td><input type="text" name="empno" id="empno" size="20"></td>
	</tr>
	<tr>
		<td class="align">사원이름</td>
		<td><input type="text" name="ename" id="ename" size="20"></td>
	</tr>
	<tr>
		<td  class="align">입사일</td>.
		<td><input type="text" name="hiredate" id="hiredate" size="20"></td>
	</tr>	
	<tr>
		<td colspan="2" class="align">				
		<input type="button" value="EMP_수정" id="updateBtn">		
	</td>				
	</tr>
</table>
</form>
</body>
</html>