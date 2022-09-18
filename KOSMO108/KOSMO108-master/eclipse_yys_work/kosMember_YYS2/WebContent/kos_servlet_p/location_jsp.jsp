<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  java.util.ArrayList import -->    
<%@ page import="java.util.ArrayList" %>    
<!--  log4j import -->
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function defPrint(){
		var x=document.getElementById("i1").value;
		document.getElementById("text").innerHTML=x;
	}
</script>
<body>
<h3>location.jsp 파일입니다.</h3>
<!-- 
화면에 출력시키는 다양한 방법

1. jsp &lt; out.println(""); &gt; 

2. js 
innerHTML
html()
text()

3. html
write()

 -->
<%
Logger logger=LogManager.getLogger(this.getClass());
	Object obj=request.getAttribute("aList");
	ArrayList<String> aList=(ArrayList<String>)obj;
	int aListsize=aList.size();
	String str="";
	String mid=aList.get(0);
	String mpw=aList.get(1);
	pageContext.setAttribute("mid", mid);
	pageContext.setAttribute("mpw", mpw);
	pageContext.setAttribute("str",str);
	
	if (aList!=null && aListsize > 0 ){	
		for(int i=0; i<aListsize; i++){
			str=aList.get(i);
			logger.info("aList의  "+i+"번째 값 >>> : "+str);
%>
			<p><% out.println(str); %></p>
			<p><%= str %></p> 
			<!-- <p> ${param.str} </p> -->		
			<!--  JSTL 반복문은 문법이 따로 있다. -->
<%			
		}	
	}
%>
<p>JSP</p>
<%= mid %><br>
<%= mpw %><br>
<hr>
<%= str %><br>
<p>EL</p>
${mid}<br>
${mpw}<br>
${s} <br>
<!-- 
<hr>
<h3>뽀개서 출력시키기</h3>
<p>mid >>>> : <= mid %></p>
<p>mpw >>>> : <= mpw %></p> 
<hr>
<h3>EL 표현식 써보기</h3>
<p> ${param.mid} </p>
<p> ${param.mpw} </p>
 -->
</body>
</html>