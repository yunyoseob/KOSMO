<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		alert("jQuery ready function 진입 >>> : ");
		
		// GET 방식
		$(document).on("click", "#getbtn", function(){
			alert("GET 방식으로 보내는 버튼을 클릭하셨습니다 >>> : ");
			$("#methodForm").attr({
				"action":"hello_get_kimstar.yys",
				"method":"GET",
				"enctype":"application/x-www-form-urlencoded"
			}).submit();
		});
		
		// POST 방식
		$(document).on("click", "#postbtn", function(){
			alert("POST 방식으로 보내는 버튼을 클릭하셨습니다 >>> : ");
			$("#methodForm").attr({
				"action":"hello_post_kimstar.yys",
				"method":"POST",
				"enctype":"application/x-www-form-urlencoded"
			}).submit();
		});
	});
</script>
</head>
<body>
<h3>Spring Hello</h3>
<hr>
<!-- a href는 get방식으로 가므로, 콘트롤러에서 RequestMethod.POST로 받을 수 없다. -->
<a href="hello_kimstar.yys">Hello Spring 실행하기</a>
<a href="hello_get_kimstar.yys">Hello GET Method</a>
<!--  a href로 보내면 POST 방식으로 받을 수 없다. -->
<a href="hello_post_kimstar.yys">Hello POST Method</a>

<form name="methodForm" id="methodForm">
	<button type="button" id="getbtn">GET</button>
	<button type="button" id="postbtn">POST</button>
</form>
<hr>
<a href="viewJsp_1_stringTest_find.yys ">viewJsp_1_stringTest_find.yys 실행</a><br>
<a href="viewJsp_2_modelandview_find.yys">viewJsp_2_modelandview_find.yys 실행</a><br>
<a href="viewJsp_3_voidTest_find.yys">viewJsp_3_voidTest_find.yys 실행</a>
<hr>
<a href="formdata_find.yys">FORM DATA 실행</a><br>
<button onclick='location.href="formdata_get_servlet.yys?datanum=11&dataid=11&datapw=11&dataname=11"'>formdata_get_servlet.yys :: url전송</button>
<hr>
<a href="autowired_test.yys">오토와이어드(의존성 주입 : DI) 생성자 실행</a><br>
<a href="autowired_test_filed.yys">오토와이어드(의존성 주입 : DI) 필드 실행</a><br>
</body>
</html>