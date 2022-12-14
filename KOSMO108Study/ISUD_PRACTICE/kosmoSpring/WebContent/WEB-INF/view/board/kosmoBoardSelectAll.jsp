<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="a.b.c.com.kosmo.board.vo.KosmoBoardVO" %> 
<%@ page import="a.b.c.com.kosmo.common.CodeUtil" %> 
<%@ page import="java.util.List" %> 

<%@ page import=" org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>

<% request.setCharacterEncoding("UTF-8");%> 
<%	
	Logger logger = LogManager.getLogger(this.getClass());
	logger.info("kosmoBoardSelectAll.jsp 페이지 >>> : ");

	Object obj = request.getAttribute("listAll");
	List<KosmoBoardVO> list = (List<KosmoBoardVO>)obj;
	
	int nCnt = list.size();
	String nCntS = ":::: 전체 조회 건수  " + nCnt + " 건";	
%>     

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/kosmoSpring/js/common.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		
		// kbnum 체크박스 체크 확인하기
		$(document).on("click", "#kbnum", function(){				
			if($(this).prop('checked')){			 			
				$('.kbnum').prop('checked',false);
				$(this).prop('checked',true);
			}
		});
		
		//  I
		$(document).on("click", "#insertBtn", function(){
			location.href="kosmoBoardInsertForm.h";
		});
		
		// SALL
		$(document).on("click", "#selectAllBtn", function(){		
			$("#boardList").attr({"method":"GET", "action":"kosmoBoardSelectAll.h"}).submit();		
		});
				
		//  S
		$(document).on("click", "#selectBtn", function(){	
			if ($('.kbnum:checked').length == 0){
				alert("글번호 하나를 선택하세요!!");
				return;
			}
			$("#boardList").attr({ "method":"GET","action":"kosmoBoardSelect.h"}).submit();
		});		
		
		//  D
		$(document).on("click", "#deletetBtn", function(){	
			if ($('.kbnum:checked').length == 0){
				alert("삭제할 글번호 하나를 선택하세요!!");
				return;
			}
			$("#boardList").attr({ "method":"GET","action":"kosmoBoardDelete.h"}).submit();
		});		
	});	

</script>
<style type="text/css">

	td, th {
		 padding: 5px;
	}

	h3, th {
		text-align: center;
	}
	.tt {
		text-align: center;
	}

</style>
</head>
<body>
<h3>게시판 글 목록</h3>
<hr>

<form name="boardList" id="boardList">
<table border="1" align="center">
<thead>
<tr>
<td colspan="9" ><%= nCntS %></td>
</tr>
<tr>
	<th><input type="checkbox" name="chkAll" id="chkAll"></th>
	<th>순번</th>
	<th>글번호</th>
	<th>글제목</th>
	<th>이름</th>
	<th>글내용</th>
	<th>사진</th>
</tr>
</thead>
<%

for(int i=0; i<nCnt; i++){		
	KosmoBoardVO _kbvo = list.get(i);	
%>
<tbody>
<tr>
	<td class="tt">
		<input type="checkbox" id="kbnum" name="kbnum" class="kbnum" value=<%= _kbvo.getKbnum() %> >
	</td>		
	<td class="tt"><%= i + 1 %></td>
	<td class="tt"><%= _kbvo.getKbnum() %> </td>
	<td class="tt"><%= _kbvo.getKbsubject() %> </td>
	<td class="tt"><%= _kbvo.getKbname() %> </td>
	<td class="tt"><%= _kbvo.getKbcontent() %> </td>
	<td class="tt"><img src="/kosmoSpring/fileupload/board/<%= _kbvo.getKbfile() %> " border="1" width="25" height="25" alt="image"></td>				
</tr>	
<%
}//end of for
%>	
<tr>
	<td colspan="9" align="right">				
		<input type="button" value="글쓰기" id="insertBtn">
		<input type="button" value="글목록" id="selectAllBtn">
		<input type="button" value="글내용보기" id="selectBtn">		
		<input type="button" value="글삭제" id="deletetBtn"> 								
	</td>
</tr>	
</tbody>	
</table>
</form>	
</body>
</html>