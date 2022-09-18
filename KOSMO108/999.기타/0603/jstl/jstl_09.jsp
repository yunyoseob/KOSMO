<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="a.b.c.test.jstl.JstlMemberVO"%>
<%@page import="java.util.ArrayList"%>

<!-- JSTL core문을 사용하기 위해서는 반드시 문서 상단에 기술 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
ArrayList<JstlMemberVO> list = new ArrayList<>();
list.add(new JstlMemberVO("홍길동1", "hong1", "1234", 11, "서울특별시", "010-1111-1111"));
list.add(new JstlMemberVO("홍길동2", "hong2", "1234", 22, "서울특별시", "010-1111-1111"));
list.add(new JstlMemberVO("홍길동3", "hong3", "1234", 33, "서울특별시", "010-1111-1111"));
list.add(new JstlMemberVO("홍길동4", "hong4", "1234", 44, "서울특별시", "010-1111-1111"));
list.add(new JstlMemberVO("홍길동5", "hong5", "1234", 55, "서울특별시", "010-1111-1111"));

pageContext.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL_09</title>
</head>
<body>
<h3>JSTL 09</h3>
<hr>
○ JAVA for<br />
<ul>
	<%
		for(int i = 0; i < list.size(); i++) {
			out.println("<li>" + list.get(i).getIrum());
			out.println(list.get(i).getId());
			out.println(list.get(i).getPw());
			out.println(list.get(i).getAge());
			out.println(list.get(i).getAddr());
			out.println(list.get(i).getTel() + "</li>");
		}
	%>
</ul>
<hr />
○ JAVA forEach<br />
<ul>
	<%
		for(JstlMemberVO mvo : list) {
			out.println("<li>");
			out.println(mvo.getIrum());
			out.println(mvo.getId());
			out.println(mvo.getPw());
			out.println(mvo.getAge());
			out.println(mvo.getAddr());
			out.println(mvo.getTel());
			out.println("</li>");
		}
	%>
</ul>
<hr />
○ EL 표기법<br />
<ul>
	<li>${list[0].irum } ${list[0].id } ${list[0].pw } ${list[0].age } ${list[0].addr } ${list[0].tel }</li>
	<li>${list[1].irum } ${list[1].id } ${list[1].pw } ${list[1].age } ${list[1].addr } ${list[1].tel }</li>
	<li>${list[2].irum } ${list[2].id } ${list[2].pw } ${list[2].age } ${list[2].addr } ${list[2].tel }</li>
	<li>${list[3].irum } ${list[3].id } ${list[3].pw } ${list[3].age } ${list[3].addr } ${list[3].tel }</li>
	<li>${list[4].irum } ${list[4].id } ${list[4].pw } ${list[4].age } ${list[4].addr } ${list[4].tel }</li>
</ul>
<hr />
○ JSTL core<br />
<ul>
	<c:forEach var="i" items="${list }">
		<li>${i.irum } ${i.id  } ${i.pw  } ${i.age  } ${i.addr } ${i.tel  }</li>
	</c:forEach>
</ul>
</body>
</html>