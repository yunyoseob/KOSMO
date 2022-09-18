<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>  
<%@ page import="a.b.c.com.emp.vo.SpringEmpVO" %>
<%@ page import="java.util.List" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>springEmpSelect.jsp</h3>
<hr>
<%
	Logger logger=LogManager.getLogger(this.getClass()); 
	logger.info("springEmpSelect.jsp 페이지 입니당 >>> : ");

	Object obj=request.getAttribute("searchList");
	if(obj==null){return;}
	
	List<SpringEmpVO> list=(List<SpringEmpVO>)obj;
	if(list.size()>0){
		for(int i=0; i<list.size(); i++){
			SpringEmpVO evo=list.get(i);
%>
			<%= evo.getEmpno() %>
			<%= evo.getEname() %>
			<%= evo.getHiredate() %>
<%			
		}
	}
%>
</body>
</html>