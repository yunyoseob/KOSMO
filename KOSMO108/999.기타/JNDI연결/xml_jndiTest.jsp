<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- JDBC객체  -->
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="javax.sql.DataSource" %>

<!-- JNDI객체 -->
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>
<%@ page import=" org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>JNDI InitialContext<br>
		JNDI : Java Naming and Directory Interface
		</h3>
		<hr>
<%
	Logger log = LogManager.getLogger(this.getClass());
	//Obtain our environment naming context
	Context initCtx = new InitialContext();
	log.info("initCtx >>> : " + initCtx);
	
	//initCtx의 lookup메서드를 이용해서 "java:comp/env" 에 해당하는 객체를 찾아서 evnCtx에 삽입
	Context envCtx = (Context)initCtx.lookup("java:comp/env");
	log.info("envCtx >>> : " + envCtx + "<br>");
	
	//Look up our data source
	//envCtx의 lookup 메소를 이용해서 "jdbc/orcle11g_orclPGW00"에 해당하는 객체를 찾아서 ds에 삽입
	//name="jdbc/Oracle11g_orclKOSMO00"
	DataSource ds = (DataSource)envCtx.lookup("jdbc/jndi_orclPGW00");
	log.info("ds >>> : " + ds +"<br><hr>");
	
	//getConnection 메서드를 이용해서 커넥션 풀로 부터 커넥션 객체를 얻어내며 conn변수에 저장
	Connection conn = ds.getConnection();
	PreparedStatement stmt = conn.prepareStatement("SELECT * FROM EMP");
	ResultSet rsRs = stmt.executeQuery();
	
	while(rsRs.next()){
		log.info(rsRs.getString(1)+" ");
		log.info(rsRs.getString(2)+" ");
		log.info(rsRs.getString(3)+" ");
		log.info(rsRs.getString(4)+" ");
		log.info(rsRs.getString(5)+" ");
		log.info(rsRs.getString(6)+" ");
		log.info(rsRs.getString(7)+" ");
		log.info(rsRs.getString(8)+" <br>");
	}
%>
	
	</body>
</html>