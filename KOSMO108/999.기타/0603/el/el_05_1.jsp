<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="a.b.c.test.jstl.JstlMemberVO"%>
<%@page import="java.util.ArrayList"%>

<%
//study[] 배열을 초기화 → 바인딩(연결) 객체 → el_06.jsp 출력
String[] study = {"JAVA", "View", "SQL", "Servlet/JSP/SPRING", "Android", "IoT", "Project"};
request.setAttribute("study", study);

//ArrayList<> 배열을 생성하고 초기화 → 바인딩(연결) 객체 → el_06.jsp 출력
ArrayList<String> list = new ArrayList<>();
list.add("오렌지");
list.add("바나나");
list.add("사과");
list.add("멜론");
list.add("레몬");
request.setAttribute("list", list);

//MemberDTO 객체를 생성하고 초기화 → 바인딩(연결) 객체 → el_06.jsp 출력
JstlMemberVO mvo = new JstlMemberVO();
mvo.setIrum("전건희");
mvo.setId("JKH");
mvo.setPw("1234");
mvo.setAge(27);
mvo.setAddr("부천시 춘의동");
mvo.setTel("02-123-4567");
request.setAttribute("mvo", mvo);

//ArralyList<> 구조에 MemberDTO 객체 배열 생성 → 바인딩(연결) 객체 → el_06.jsp 출력
ArrayList<JstlMemberVO> mlist = new ArrayList<>();
mlist.add(new JstlMemberVO("홍길동1", "hong1", "1234", 11, "광주시", "010-1111-1111"));
mlist.add(new JstlMemberVO("홍길동2", "hong2", "1234", 22, "광주시", "010-1111-1111"));
mlist.add(new JstlMemberVO("홍길동3", "hong3", "1234", 33, "광주시", "010-1111-1111"));
mlist.add(new JstlMemberVO("홍길동4", "hong4", "1234", 44, "광주시", "010-1111-1111"));
mlist.add(new JstlMemberVO("홍길동5", "hong5", "1234", 55, "광주시", "010-1111-1111"));
request.setAttribute("mlist", mlist);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL_5 Main</title>
</head>
<body>
<h3>el_05.jsp</h3>
<hr>
</body>
</html>
<jsp:forward page="el_06.jsp" />
