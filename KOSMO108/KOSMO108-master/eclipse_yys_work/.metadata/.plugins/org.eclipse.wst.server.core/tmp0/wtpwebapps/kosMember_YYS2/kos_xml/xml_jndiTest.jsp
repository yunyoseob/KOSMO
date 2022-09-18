<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- JDBC 객체 import -->    
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="javax.sql.DataSource" %>

<!-- JNDI 객체 import -->
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>
JNDI InitalContext <br>
JNDI : Java Naming and Directory Interface   
</h3>
<hr>
<%	
	//Obtain our environment naming context
	Context initCtx = new InitialContext();
	out.println("initCtx >>> : " + initCtx + "<br>");
	
	//initCtx의 lookup메서드를 이용해서 "java:comp/env" 에 해당하는 객체를 찾아서 evnCtx에 삽입
	Context envCtx = (Context) initCtx.lookup("java:comp/env");
	out.println("envCtx >>> : " + envCtx + "<br>");
	
	//Look up our data source
	//envCtx의 lookup메서드를 이용해서 "jdbc/Oracle11g_orclHBE00"에 해당하는 객체를 찾아서 ds에 삽입
	//name="jdbc/Oracle11g_orclKOSMO00"
	DataSource ds = (DataSource)envCtx.lookup("jdbc/jndi_orclHBE00");
	out.println("ds >>> : " + ds + "<br><hr>");

	//getConnection메서드를 이용해서 커넥션 풀로 부터 커넥션 객체를 얻어내어 conn변수에 저장
	Connection conn = ds.getConnection();
	PreparedStatement stmt = conn.prepareStatement("SELECT * FROM EMP");
	ResultSet rsRs = stmt.executeQuery();
	
	while (rsRs.next()){
		out.println(rsRs.getString(1) + " ");
		out.println(rsRs.getString(2) + " ");
		out.println(rsRs.getString(3) + " ");
		out.println(rsRs.getString(4) + " ");
		out.println(rsRs.getString(5) + " ");
		out.println(rsRs.getString(6) + " ");
		out.println(rsRs.getString(7) + " ");
		out.println(rsRs.getString(8) + " <br>");
	}

%>

</body>
</html>
</body>
</html>