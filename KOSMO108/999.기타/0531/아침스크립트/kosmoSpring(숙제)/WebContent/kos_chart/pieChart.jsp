<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.DriverManager" %>

<%@ page import="javax.sql.DataSource" %>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %>

<%@ page import=" org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="a.b.c.test.json.PieChartVO" %>

<% request.setCharacterEncoding("UTF-8"); %>
<%
	Logger logger = LogManager.getLogger(this.getClass());
	logger.info("pieChart.jsp 페이지 >>> : ");

	Context ct = new InitialContext();			
	DataSource ds = (DataSource) ct.lookup("java:comp/env/jdbc/jndi_spring_orclHBE00");
	Connection conn = ds.getConnection();
	PreparedStatement stmt = conn.prepareStatement("SELECT * FROM PIE_CHART");
	ResultSet rsRs = stmt.executeQuery();
	
	ArrayList<PieChartVO> aList = new ArrayList<PieChartVO>();	
	while (rsRs.next()){
		PieChartVO pvo = new PieChartVO();
		pvo.setTask(rsRs.getString(1));
		pvo.setHoursday(rsRs.getString(2));		
		aList.add(pvo);
	}	
%>   
<%
	PieChartVO _pvo0 = aList.get(0);
	String _t0 = _pvo0.getTask();
	String _h0 = _pvo0.getHoursday();
	
	PieChartVO _pvo1 = aList.get(1);
	String _t1 = _pvo1.getTask();
	String _h1 = _pvo1.getHoursday();
	
	PieChartVO _pvo2 = aList.get(2);
	String _t2 = _pvo2.getTask();
	String _h2 = _pvo2.getHoursday();
	
	PieChartVO _pvo3 = aList.get(3);
	String _t3 = _pvo3.getTask();
	String _h3 = _pvo3.getHoursday();
	
	PieChartVO _pvo4 = aList.get(4);
	String _t4 = _pvo4.getTask();
	String _h4 = _pvo4.getHoursday();	
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">

	var t0 = "<%= _t0 %>";
	var h0 = Number("<%= _h0 %>");	
	alert(typeof(t0));
	alert(typeof(h0));
	
	var t1 = "<%= _t1 %>";
	var h1 = Number("<%= _h1 %>");	
	
	var t2 = "<%= _t2 %>";
	var h2 = Number("<%= _h2 %>");	
	
	var t3 = "<%= _t3 %>";
	var h3 = Number("<%= _h3 %>");	
	
	var t4 = "<%= _t4 %>";
	var h4 = Number("<%= _h4 %>");	
	

	google.charts.load('current', {'packages':['corechart']});
	google.charts.setOnLoadCallback(drawChart);
	
	function drawChart() {
	
		var data = google.visualization.arrayToDataTable([
															['Task', 'Hours per Day'],
															[t0,     h0],
															[t1,     h1],
															[t2,     h2],
															[t3,     h3],
															[t4,     h4]
														 ]);
		
		var options = {
			title: 'My Daily Activities'
		};
		
		var chart = new google.visualization.PieChart(document.getElementById('piechart'));	
		chart.draw(data, options);
	}
</script>
</head>
<body>
<div id="piechart" style="width: 900px; height: 500px;"></div>
</body>
</html>
    