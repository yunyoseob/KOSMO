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
<%@ page import="a.b.c.test.json.BarChartVO" %>

<% request.setCharacterEncoding("UTF-8"); %>
<%
	Logger logger = LogManager.getLogger(this.getClass());
	logger.info("barChart.jsp 페이지 >>> : ");

	Context ct = new InitialContext();	
	//Servers :: Context.xml :: <Resource name="jdbc/jndi_spring_orclPGW00" ~>
	//자바네이밍디렉토리인터페이스(JNDI)
	DataSource ds = (DataSource) ct.lookup("java:comp/env/jdbc/jndi_spring_orclHBE00");
	Connection conn = ds.getConnection();
	PreparedStatement stmt = conn.prepareStatement("SELECT * FROM BAR_CHART");
	ResultSet rsRs = stmt.executeQuery();
	
	ArrayList<BarChartVO> aList = new ArrayList<BarChartVO>();	
	while (rsRs.next()){
		BarChartVO bvo = new BarChartVO();
		bvo.setYyyy(rsRs.getString(1));
		bvo.setSales(rsRs.getString(2));
		bvo.setCosts(rsRs.getString(3));		
		aList.add(bvo);
	}	
%>
<%
	BarChartVO _bvo0 = aList.get(0);
	String _yyyy0 = _bvo0.getYyyy();
	String _sales0 = _bvo0.getSales();
	String _costs0 = _bvo0.getCosts();
	
	BarChartVO _bvo1 = aList.get(1);
	String _yyyy1 = _bvo1.getYyyy();
	String _sales1 = _bvo1.getSales();
	String _costs1 = _bvo1.getCosts();
	
	BarChartVO _bvo2 = aList.get(2);
	String _yyyy2 = _bvo2.getYyyy();
	String _sales2 = _bvo2.getSales();
	String _costs2 = _bvo2.getCosts();
	
	BarChartVO _bvo3 = aList.get(3);
	String _yyyy3 = _bvo3.getYyyy();
	String _sales3 = _bvo3.getSales();
	String _costs3 = _bvo3.getCosts();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://www.gstatic.com/charts/loader.js"></script>
<script>

	var y0 = "<%= _yyyy0 %>";
	var s0 = Number("<%= _sales0 %>");
	var c0 = Number("<%= _costs0 %>");
	alert(typeof(y0));
	alert(typeof(s0));
	alert(typeof(c0));
	
	var y1 = "<%= _yyyy1 %>";
	var s1 = Number("<%= _sales1 %>");
	var c1 = Number("<%= _costs1 %>");
	
	var y2 = "<%= _yyyy2 %>";
	var s2 = Number("<%= _sales2 %>");
	var c2 = Number("<%= _costs2 %>");
	
	var y3 = "<%= _yyyy3 %>";
	var s3 = Number("<%= _sales3 %>");
	var c3 = Number("<%= _costs3 %>");
	
	//구글 시각화 API를 로딩하는 메소드
	google.charts.load('current', {packages: ['corechart']});
	
	// 구글 시각화 API가 로딩이 완료되면,
	// 인자로 전달된 콜백함수를 내부적으로 호출하여 차트를 그리는 메소드
	// 화면이 실행될때 함께 실행된다.
	//google.charts.setOnLoadCallback(columnChart1);
	
	// 묶은 세로 막대형 차트 1
	function columnChart1() {
	
		// 버튼 클릭 시 ajax를 사용하여 서버로부터 json 배열 객체를 가져왔다고 가정함
		var arr = [
					['년도', '매출액', '비용'],
					[y0, s0, c0],
					[y1, s1, c1],
					[y2, s2, c2],
					[y3, s3, c3],					
				  ];
		
		// 실 데이터를 가진 데이터테이블 객체를 반환하는 메소드
		var dataTable = google.visualization.arrayToDataTable(arr);
		
		// 옵션객체 준비
		var options = {
						title: '회사 실적',
						hAxis: {
								title: '년도',
								titleTextStyle: {color: 'red'}
						}
					  };
		
		// 차트를 그릴 영역인 div 객체를 가져옴
		var objDiv = document.getElementById('column_chart_div1');
		
		// 인자로 전달한 div 객체의 영역에 컬럼차트를 그릴수 있는 차트객체를 반환
		var chart = new google.visualization.ColumnChart(objDiv);
		
		// 차트객체에 데이터테이블과 옵션 객체를 인자로 전달하여 차트 그리는 메소드
		chart.draw(dataTable, options);
		
	} // drawColumnChart1()의 끝

 

	// 버튼 동작
	$(document).ready(function(){
		$('button').on('click', function(){
			columnChart1();
		});
	});

</script>
</head>
<body>
<button type="button" id="btn">버튼</button>
<div id="column_chart_div1" style="width: 900px; height: 500px;"></div>
</body>
</html>