<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>  
<%@ page import="org.apache.log4j.Logger" %>     
<%@ page import="javax.servlet.http.HttpServletRequest" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>formdata_get_servlet.jsp 페이지 입니당</h3>
el_datanum >>>>	${el_datanum }
<hr>
el_dataid >>> ${el_dataid }
<hr>
el_datapw >>>  ${el_datapw }
<hr>
el_dataname >>> ${el_dataname }

<%
	Logger logger = LogManager.getLogger(this.getClass());
	logger.info("formdata_get_servlet.jsp 페이지 입니당 >>> : ");
	
	
	Object obj_datanum=request.getAttribute("request_datanum");
	String datanum=(String)obj_datanum;
	logger.info("datanum >>> : "+datanum);
	
	Object obj_dataid=request.getAttribute("request_dataid");
	String dataid=(String)obj_dataid;
	logger.info("dataid >>> : "+dataid);
	
	Object obj_datapw=request.getAttribute("request_datapw");
	String datapw=(String)obj_datapw;
	logger.info("datapw >>> : "+datapw);
	
	Object obj_dataname=request.getAttribute("request_dataname");
	String dataname=(String)obj_dataname;
	logger.info("dataname >>> : "+dataname);
%>	 
</body>
</html>