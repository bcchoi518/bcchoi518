<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file = "../../../_include/inc_header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file = "../../../_include/inc_menu.jsp" %>
	
	<h2>학사관리_성적삭제</h2>
	
	<form name="DirForm">
		<input type="hidden" name="sungjukNo" value="${requestScope.dto.sungjukNo }"/>
		<table border="1" width="80%">
			<tr>
				<td>성적번호</td>
				<td>${requestScope.dto.sungjukNo }</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>${requestScope.dto.name }</td>
			</tr>
			<tr>
				<td>시험명</td>
				<td>${requestScope.dto.sihumName }</td>
			</tr>
			<tr>
				<td>국어</td>
				<td>${requestScope.dto.kor }</td>
			</tr>
			<tr>
				<td>영어</td>
				<td>${requestScope.dto.eng }</td>
			</tr>
			<tr>
				<td>수학</td>
				<td>${requestScope.dto.mat }</td>
			</tr>
			<tr>
				<td>과학</td>
				<td>${requestScope.dto.sci }</td>
			</tr>
			<tr>
				<td>역사</td>
				<td>${requestScope.dto.his }</td>
			</tr>
			<tr>
				<td>총점</td>
				<td>${requestScope.dto.tot }</td>
			</tr>
			<tr>
				<td>평균</td>
				<td>${requestScope.dto.avg }</td>
			</tr>
			<tr>
				<td>등급</td>
				<td>${requestScope.dto.grade }</td>
			</tr>
			<tr>
				<td>등록일</td>
				<td>${requestScope.dto.regiDate }</td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="button" onclick="save()">삭제하기</button>
				</td>
			</tr>
		</table>
	</form>
	
	<script>
		function save() {
			if (confirm('삭제하시겠습니까?')) {
				document.DirForm.action = '${path }/haksaSungjuk_servlet/sakjeProc.do';
				document.DirForm.method = 'post';
				document.DirForm.submit();
			}//if
		}//save
	</script>
	
</body>
</html>