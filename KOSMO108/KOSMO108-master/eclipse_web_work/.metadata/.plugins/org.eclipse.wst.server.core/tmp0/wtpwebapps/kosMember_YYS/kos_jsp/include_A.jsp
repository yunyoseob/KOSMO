<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INCLUDE_A</title>
</head>
<body>
<%@ include file="include_header.html" %>
<h3  style="background-color: blue;">INCLUDE_A JSP</h3>
<h>
<hr>
<%
	String mid = request.getParameter("mid");;
	String mpw = request.getParameter("mpw");
	out.println("forward_A mid >>> : " + mid + "<br>");
	out.println("forward_A mpw  >>> : " + mpw + "<br>");
	System.out.println("forward_A mid >>> : " + mid);
	System.out.println("forward_A mpw  >>> : " + mpw);
	
	String param_3 = "param_3";
	String param_4 = "param_4";
%>
<%--
<jsp:forward page="/kos_jsp/forward_B.jsp" />
--%>
<jsp:include page="/kos_jsp/include_B.jsp">
	<jsp:param name="param_1" value="<%= mid %>" />
	<jsp:param name="param_2" value="<%= mpw %>" />
	<jsp:param name="param_3" value="<%= param_3 %>" />
	<jsp:param name="param_4" value="<%= param_4 %>" />
</jsp:include>
<%@ include file="include_footer.html" %>
</body>
</html>