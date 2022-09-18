<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SCOPE JSP</title>
<link rel="stylesheet" href="/kosMember_YYS/css/yysColor.css">
</head>
<body>
<%
	// jsp 태그 안에서 변수 선언
	String scope="scope test";
%>
String scope="scope test";
<!-- html p태그 안에서 쓴 글-->
<%
	// jsp 태그 안에서 내장객체 사용
	pageContext.setAttribute("scope_page", scope);
	request.setAttribute("scope_request", scope);
	session.setAttribute("scope_session", scope);
	application.setAttribute("scope_application", scope);
%>
<!-- 
해부
C:\00.KOSMO108\30.Web\eclipse_web_work\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost
\kosMember_YYS\org\apache\jsp\kos_005fjsp_005fp\scope_jsp.class


javax/servlet/http/HttpSession

org/apache/jasper/runtime/PageContextImpl
javax/servlet/jsp/PageContext;
org/apache/jasper/runtime/ProtectedFunctionMapper

 -->
<p>
jsp expression 표현식
<hr>

&lt;% %&gt; 를 제외하고는 html 블럭의 말이다.<br>

&lt;%= scope %&gt; -> <%= scope %><br>
<!--  scope test -->
&lt;%= pageContext.getAttribute("scope_page") %&gt; -> <%= pageContext.getAttribute("scope_page") %><br>

<!-- scope test -->
&lt;%= request.getAttribute("scope_request") %&gt; -> <%= request.getAttribute("scope_request") %><br>
<!-- scope test -->
&lt;%= session.getAttribute("scope_session") %&gt; -> <%= session.getAttribute("scope_session") %><br>
<!-- scope test -->
&lt;%= application.getAttribute("scope_application") %&gt; -> <%= application.getAttribute("scope_application") %><br>
<!-- scope test -->

<p>
el : Expression Language 표현식 
<hr>
\${ scope } -> ${ scope }<br>
\${ scope_page } -> ${ scope_page }<br>
\${ scope_request } -> ${ scope_request }<br>
\${ scope_session } -> ${ scope_session }<br>
\${ scope_application } -> ${ scope_application }<br>

</body>
</html>