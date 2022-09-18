<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jQuery CDN 불러오기  -------------------------------------------->
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">	
	$(document).ready(function(){
		alert("jQuery ready 함수 진입 >>> : ");
		
		$(function(){
			let urlV="ajax_weathergokr_rss.xml";
			let dtV="xml";
			console.log("urlV >>> : "+urlV);
			console.log("dtV >>> : "+dtV);
			
			$.ajax({
				url:urlV,
				dataType:dtV,
				success:function(data){
					alert("data >>> : "+data);
					var items_ = $(data).find("data");
					alert("items_ >>> : "+items_);
					
					if(items_.length>0){
						items_=items_.slice(0,13);
						var dataTable=$("<table border='1' />");
						var f_row=$("<tr />").append(
							$('<td>날짜</td>'),
							$('<td>최저 기온</td>'),
							$('<td>최고 기온</td>')
						);
						dataTable.append(f_row);
						$(".wrap").append(dataTable);
						
						$.each(items_, function(idx, val){
							// 날짜
							var td=$(val).find("tmEf").text();
							// 최저 온도
							var tmn=$(val).find("tmn").text();
							// 최고 온도
							var tmx=$(val).find("tmx").text();
							
							var row=$("<tr />").append(
											$('<td />').text(td),
				    				        $('<td />').text(tmn),
				    				        $('<td />').text(tmx)
				    				        );
							dataTable.append(row);
						}); // $.each(items_, function(idx, val){}) 
						$(".wrap").append(dataTable);
					} // end of if(items_.length>0)
					
				}, // end of function(data)
				error:function(e){
					alert(e.responseTest);
				} // end of error
			}); // end of $.ajax({})
			
		}); // end of $(function(){});
	}); // document ready function
</script>
<style type="text/css">
	body{
		left:50%;
		right:50%;
		margin: 25px auto
		padding: 25px;
		background-image:url("https://www.10wallpaper.com/wallpaper/1366x768/1411/a_sunny_days_end-Photos_HD_Wallpaper_1366x768.jpg");
		background-repeat:no-repeat;
		background-size:cover;
	}
	
	table{
		background-color:#ffc299; 
		width:450px;
		text-align:center;
		box-sizing:border-box;
		box-shadow:10px 10px 10px grey;
	}
</style>
</head>
<body>
<h3 style="color:#ffc299;">기상청 전국 일기예보 :: 서울</h3>
<hr>
<div class="wrap"></div>
</body>
</html>