<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>html5p4 요청 데이터 받기</title>
</head>
<body>
	<h3>html5p4 요청 데이터 받기</h3>
<%
	String uid=request.getParameter("uid");
	String umail=request.getParameter("umail");
	String pwd1=request.getParameter("pwd1");
	String mailing=request.getParameter("mailing");
	
	System.out.println("html5p4.html 파일 form 태그에서 전송된 요청 정보를  \n");
	System.out.println("html5p4.jsp jsp 파일에서 받아서 콘솔에 출력하기 \n");
	System.out.println("uid >>> : "+uid);
	System.out.println("umail >>> : "+umail);
	System.out.println("pwd1 >>> : "+pwd1);
	System.out.println("mailing >>> : "+mailing);

	out.println("html5p4.html :: html파일 form 태그에서 전송된 요청 정보를  "+"<br>");
	out.println("html5p4.jsp :: jsp파일에서 받아서 브라우저에 출력하기"+"<br>");
	out.println("umail >>> : "+umail+"<br>");
	out.println("pwd1 >>> : "+pwd1+"<br>");
	out.println("mailing >>> : "+mailing+"<br>");
%>
</body>
</html>