<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    <%@ page import="com.oreilly.servlet.MultipartRequest" %>   
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>    
<%@ page import="java.io.File" %>         
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String saveDirectory=pageContext.getServletContext().getRealPath("/upload/aaaa/");
	out.println("saveDirectory >>> : "+saveDirectory+"<br>");
	
	File saveDir=new File(saveDirectory);
	
	if(!saveDir.exists()){
		saveDir.mkdirs();
	}
	
	int maxPostsize=1024*1024*5;
	String encoding="UTF-8";
	String filename1="";
	String filename2="";
	

	try{		
		MultipartRequest mr=new MultipartRequest(request, 
				saveDirectory, maxPostsize, encoding, new DefaultFileRenamePolicy());
		out.println("mr 참조변수 가지고 서버에 업로드된 파일 정보. <br>");
		
		// name
		String name=mr.getParameter("name");
		out.println("name >>> : "+name+"<br>");
		
		// file
		Enumeration<String> files=mr.getFileNames();
		
		String file1=String.valueOf(files.nextElement());
		filename1=mr.getFilesystemName(file1);
		out.println("filename1 >>> : "+filename1+"<br>");
		
		String file2=String.valueOf(files.nextElement());
		filename2=mr.getFilesystemName(file2);
		out.println("filename2 >>> : "+filename2+"<br>");
		
	}catch(Exception e){
		System.out.println("에러가 >>> : "+e.getMessage());
	}
%>
<h3>File Upload Testing</h3>
<hr>
<table border="1">
<tr align="center">
	<td><%= filename1 %></td>
	<td><img src="/kosMember_YYS2/upload/aaaa/<%= filename1 %>"></td>
</tr>
<tr>
	<td><%= filename2 %></td>
	<td><img src="/kosMember_YYS2/upload/aaaa/<%= filename2 %>"></td>
</tr>
</table>
<body>
</body>
</html>