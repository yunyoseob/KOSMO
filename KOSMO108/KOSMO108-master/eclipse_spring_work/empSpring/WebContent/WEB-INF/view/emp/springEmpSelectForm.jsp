<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/empSpring/calendar_datepicker/jquery-ui-1.12.1/jquery-ui.min.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="/empSpring/calendar_datepicker/jquery-ui-1.12.1/jquery-ui.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		alert("jQuery ready 함수 진입 >>> : ");
		$("#search_btn").click(function(){
			alert("검색 버튼을 클릭하셨습니다 >>> : ");
			$("#empSearchForm").attr({
				"method":"GET",
				"action":"springEmpSelect.yys"
			}).submit();
		});
		
		// datapicker
		$("#startDate").datepicker({
			showOn: "button",			
	        buttonImage: "/empSpring/calendar_datepicker/images/calendar.gif",
	        dateFormat: 'yy-mm-dd',
		    buttonImageOnly: false,
			buttonText: "Select date"
		});
		
		$("#endDate").datepicker({
			showOn: "button",
	        buttonImage: "/empSpring/calendar_datepicker/images/calendar.gif",
	        dateFormat: 'yy-mm-dd',
		    buttonImageOnly: false,
			buttonText: "Select date"
		});
	});
</script>
</head>
<body>
<h3>springEmpSelectForm.jsp</h3>
<hr>
<form name="empSearchForm" id="empSearchForm">
	<select id="searchFilter" name="searchFilter">
		<option value="key_00">전체-----------</option>
		<option value="key_01">사번</option>
		<option value="key_02">이름</option>
	</select>
	<input type="text" id="keyword" name="keyword" placeholder="검색어 입력"><br>	
	<!--
	<input type="text" id="startDate" name="startDate" style="text-align:left; width:100px; height:13px;" placeholder="시작일 "> 
	 -->		
	<input type="text" id="startDate" name="startDate" size="10" placeholder="시작일 ">
	~
	<!-- 
	<input type="text" id="endDate" name="endDate" style="text-align:left; width:100px; height:13px;" placeholder="종료일">
	 -->
	<input type="text" id="endDate" name="endDate" size="10" placeholder="종료일"><br>	
	<input type="button" id="search_btn" name="search_btn" value="검색">
	<input type="reset" id="reset_btn" name="reset_btn" value="리셋"><br>
</form>
</body>
</html>