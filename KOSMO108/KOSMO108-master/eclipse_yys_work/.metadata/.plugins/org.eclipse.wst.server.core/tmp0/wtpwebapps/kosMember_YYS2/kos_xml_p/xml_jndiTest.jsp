<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  JDBC 객체 import -->
<%@ page import="java.sql.Connection" %>
<%@ page import= "java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="javax.sql.DataSource" %>

<!-- JNDI 객체 import -->
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<!--  log4j -->
<%@ page import="org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>
JNDI InitialContext <br>
JNDI : Java Naming and Directory Interface
</h3>
<hr>
<%
	Logger logger=LogManager.getLogger(this.getClass());
	// Obtain our environment naming context
	Context initCtx=new InitialContext();
	/*
	javax.naming.Context
	
	All known Implementing Classes:
		InitialContext...
		
	javax.naming.initialContext
	
	public class InitialContext extends Object
	implements Context
	
	상속받은 클래스에서 생성자를 생성하여, 부모 클래스의 자원을 쓰기 위한 명령어
	
	Constructs an initial context. 
	No environment properties are supplied. Equivalent to new InitialContext(null).
	*/
	logger.info("initCtx >>> : "+initCtx);
	// initCtx >>> : javax.naming.InitialContext@2693932b
	out.println("initCtx >>> : "+initCtx+"<br>");

	// initCtx의 lookup 메서드를 이용해서 "java:comp/env"에 해당하는 객체를 찾아서  evnCtx에 삽입
	Context envCtx=(Context)initCtx.lookup("java:comp/env");
	/*
		javax.naming.Context
		.lookup(String name)
		
		Modifier and Type	:: Method and Description
		Object :: lookup(String name)
		
		Retrieves the named object. See lookup(Name) for details.
		
		Parameters:
			name - the name of the object to look up
		Returns:
			the object bound to name
			
		Object 클래스로 리턴 받은 값을 클래스 다운캐스팅을 통해 Context 클래스에 참조변수로 선언
	*/
	logger.info("envCtx >>> : "+envCtx);
	// envCtx >>> : org.apache.naming.NamingContext@10f809d2
	out.println("envCtx >>> : "+envCtx+"<br>");
	
	// Look up our data source
	// envCtx의 lookup 메서드를 이용해서 "jdbc/Oracle11g_orclYYS00에 해당하는 객체를 찾아서
	// ds에 삽입
	// name="jdbc/Oracle11g_orclKOSMO00"
	
	// 다음 줄에서 에러나는데 다음에 처리하기
	DataSource ds = (DataSource)envCtx.lookup("jdbc/jndi_orclYYS00");
	// 다시 한번, lookup 함수를 써서 명명된 개체를 검색
	// Object로 리턴된 값을 클래스 다운 캐스팅을 통해 DataSource 클래스의 참조변수로 선언
	/*
	javax.sql.DataSource
	*/
	
	
	logger.info("ds >>> : "+ds);
	// ds >>> : org.apache.tomcat.dbcp.dbcp2.BasicDataSource@33a5bd37
	out.println("ds >>> : "+ds+"<br><hr>");
	
	// getConnection 메서드를 이용해서 커넥션 풀로 부터 커넥션 객체를 얻어내어 conn변수에 저장
	Connection conn=ds.getConnection();
	PreparedStatement stmt=conn.prepareStatement("SELECT * FROM EMP");
	ResultSet rsRs=stmt.executeQuery();
	
	while(rsRs.next()){
		out.println(rsRs.getString(1)+" ");
		out.println(rsRs.getString(2)+" ");
		out.println(rsRs.getString(3)+" ");
		out.println(rsRs.getString(4)+" ");
		out.println(rsRs.getString(5)+" ");
		out.println(rsRs.getString(6)+" ");
		out.println(rsRs.getString(7)+" ");
		out.println(rsRs.getString(8)+"<br>");	
	}
%>
</body>
</html>