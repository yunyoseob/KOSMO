<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VELOG_1</title>
</head>
<body>
<h3 style="background-color:red;">VELOG_1</h3>
<!-- 
	String s="velog";
	pageContext.forward("/kos_jsp_p/velog_2.jsp?s="+s);
	// response.sendRedirect("/kosMember_YYS//kos_jsp_p/velog_2.jsp?s="+s);
 -->
<script>
location.href="/kosMember_YYS/kos_jsp_p/velog_2.jsp?s=velog"; 
</script>
</body>
</html>