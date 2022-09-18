<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  java.io, java.net 패키지의 클래스 import 해오기 -->
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page import="java.net.URL" %> 
<!--  log4j import 해오기 -->
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>
<%
Logger logger=LogManager.getLogger(this.getClass()); 
	String strHtml="";
	String strLine="";
	try{
		String strUrl="http://localhost:8088/kosMember_YYS2/study/velog.xml";
		// xml 주소 불러오기
		
		BufferedReader br=new BufferedReader(
				new InputStreamReader((new URL(strUrl)).openConnection().getInputStream(), "UTF-8"));
		
		while((strLine=br.readLine())!=null){
			strHtml+=strLine;
		}
		logger.info("strHtml >>> : "+strHtml);
		br.close();
	}catch(Exception e){
		logger.info("error >>> : "+e.getMessage());
	}
%>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>XML PARSING</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
 $(document).ready(function(){
	var xmlText, xmlParser, xmlDoc;
	
	xmlText='<%= strHtml %>';
	console.log("xmlText >>> : "+xmlText);
	
	xmlParser=new DOMParser();
	xmlDoc=xmlParser.parseFromString(xmlText, "text/xml");
	console.log("xmlDoc >>> : "+xmlDoc);
	
	$("#parseText").click(function(){
		console.log(xmlDoc.getElementsByTagName("TEXT")[0].childNodes[0].nodeValue);
		document.getElementById("text").innerHTML=xmlDoc.getElementsByTagName("TEXT")[0].childNodes[0].nodeValue
	});
	
	$("#parseFind").click(function(){
		var txt=$(xmlDoc).find("TEXT").text();
		console.log("txt >>> : "+txt);
		document.getElementById("text").innerHTML=txt;
	});
	
 });

</script>
</head>
<body>
<h3>XML PARSING 하기</h3>
<button id="parseText">DOM Parser로 XML 파싱하기</button>
<button id="parseFind">find() 함수로 파싱하기</button>
<p id="text"></p>
</body>
</html>