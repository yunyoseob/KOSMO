<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="a.b.c.test.Hello" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Hello hr=new Hello();
hr.test();
out.println("hello");

String str=request.getParameter("mid");
out.println("발사잇 >>> : "+str);
System.out.println("발사잇 2 >>> : "+str);

%>

</body>
</html>