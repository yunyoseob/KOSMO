<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		border: 1px solid black;
		text-align:center;
		margin: auto;
 		width: 50%;
	}
	
	tr, td{
		border: 1px solid black;
		text-align:center;
		width:50px;
	}
	
	h3, p{
		text-align:center;
		color:green;
	}
	
	.wrap{
		background-image:url('data:image/png;base64,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');
		background-repeat:repeat;
		background-size:auto;
	}
	
	.container{
		margin: auto;
		width:50%;
		box-shadow:7px 7px grey;
		background-color:rgb(255, 255, 204);	
	}
</style>
</head>
<body>
<div class="wrap">
<div class="container">
<h3>코스모마켓에 오신 것을 환영합니다.</h3>
<p style="color:red;">환불 안 돼요. 사기를 당해도 보장하지 않습니다.</p>
<hr>
<h3>KOSMO_PRODUCT</h3>
<table>
	<tr>
		<td colspan="5">KOSMO_PRODUCT</td>
	</tr>
	<tr>
	<!--  주의할 점 :
		 a : anchor 태그로 컨트롤러에 보낼 땐, get방식으로만 받을 수 있다
		 
		 searlize() : 폼태그 안에 있는 내용을 히든으로 안에다 다 때려 넣으세요~
		 비밀 댓글, 댓글 비밀번호 등등..
		 익명으로 처리해야 할 일이 생기면 쓴다.
	-->
		<td><a href="kosmoProductInsertForm.yys">INSERT </a></td>
		<td><a href="kosmoProductSelectAll.yys">SELECT ALL</a></td>
		<td><a href="kosmoProductSelectForm.yys">SELECT</a></td>
		<td><a href="kosmoProductUpdateForm.yys">UPDATE</a></td>
		<td><a href="kosmoProductDeleteForm.yys">DELETE</a></td>
	</tr>
</table>
<!-- 회원 입력, 전체 조회, 로그인, 조건 조회, 업데이트, 삭제 -->
<h3>KOSMO MEMBER</h3>
<table>
	<tr>
		<td colspan="5">KOSMO MEMBER</td>
	</tr>
	<tr>
		<td><a href="kosmoMemberInsertForm.yys">INSERT</a></td>
		<td><a href="kosmoMemberSelectAll.yys">SELECT ALL</a></td>
		<td><a href="kosmoMemberSelectForm.yys">SELECT</a></td>
		<td><a href="kosmoMemberUpdateForm.yys">UPDATE</a></td>
		<td><a href="kosmoMemberDeleteForm.yys">DELETE</a></td>
	</tr>
</table>
<!-- 장바구니 입력, 전체 조회, 조건 조회, 업데이트, 삭제 -->
<h3>KOSMO CART</h3>
<table>
	<tr>
		<td colspan="5">KOSMO_CART</td>
	</tr>
	<tr>
		<td><a href="kosmoCartSelectAll.yys">SELECT ALL</a></td>
		<!--
		<td><a href="kosmoCartSelectForm.yys">SELECT</a></td>
		<td><a href="kosmoCartUpdateForm.yys">UPDATE</a></td>
		<td><a href="kosmoCartDeleteForm.yys">DELETE</a></td>
		-->
	</tr>
</table>
<!--  게시판 글쓰기, 게시판 전체 조회 -->
<h3>KOSMO BOARD</h3>
<table>
	<tr>
		<td colspan="5">KOSMO BOARD</td>
	</tr>
	<tr>
		<td><a href="kosmoBoardInsertForm.yys">INSERT</a></td>
		<td><a href="kosmoBoardSelectAll.yys">SELECT ALL</a></td>
	</tr>
</table>
<hr>
<p><a href="kosmoLoginForm.yys">LOGIN KOSMO</a><br></p>
<p><a href="kosmoMainPage.h">코스모 메인</a></p><br>
</div>
</div>
</body>
</html>