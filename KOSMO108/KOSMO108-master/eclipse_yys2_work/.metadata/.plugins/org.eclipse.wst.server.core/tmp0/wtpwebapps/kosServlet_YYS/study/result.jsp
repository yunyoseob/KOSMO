<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과발표</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
// $(".d2").fadeOut(0);
 $(document).ready(function(){
	$("#d2").fadeOut(0);
	$("#i1").click(function(){
		$("#d1").fadeOut(0);
		$("#d2").fadeIn(0);
	}); 
 });
</script>
<style type="text/css">
body{
		border: 5px solid #2ECC71;
		background-color:#e6e6ff;
		text-align:center;
		margin: 300px 20px;
	}
div{
	box-sizing: border-box;
	margin:40px auto;
}	
 p{
	font-size:50px;
	border: 5px solid #3385ff; 
	padding:20px; 
	margin:10px auto; 
	box-sizing:content-box;
}
</style>

</head>
<body>
<h3 style="font-size:50px; color:#3385ff">결과 발표</h3>
<br>
<hr>

<%	
	Logger logger=LogManager.getLogger(this.getClass());
	
	Object obj1=request.getAttribute("first");
	String firstPerson=(String)obj1;
	logger.info("firstPerson >>> : "+firstPerson);
	
	Object obj2=request.getAttribute("second");
	String secondPerson=(String)obj2;
	logger.info("firstPerson >>> : "+secondPerson);
%>
<div>
	<img id="img" src="/kosServlet_YYS/image/658670ef05962096b018164f1eb18b31.gif" alt="쥬스가 안나와요ㅠㅠ" height=450px;>
	<h3>첫 번째 발표자</h3>
	<p><%= firstPerson %></p>
	<h3>두 번째 발표자</h3>
	<p><%= secondPerson %></p>
</div>
</body>
</html>