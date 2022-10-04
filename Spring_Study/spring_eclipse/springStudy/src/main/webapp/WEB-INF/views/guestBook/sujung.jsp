<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file = "../_include/inc_header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file = "../_include/inc_menu.jsp" %>
	
	<h2>${requestScope.title }</h2>
	
	<form name="DirForm">
		<input type="hidden" name="no" id="no" value="${requestScope.dto.no }" />
		<table border="1" align="center" width="80%">
			<tr>
				<td style="width:10%;">이름(*)</td>
				<td><input type="text" name="name" id="name" value="${requestScope.dto.name }" /></td>
			</tr>
			<tr>
				<td>비밀번호(*)</td>
				<td><input type="password" name="passwd" id="passwd" value="" /></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email" id="email" value="${requestScope.dto.email }" /></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="content" style="width:99%; height:200px;">${requestScope.dto.content }</textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center" style="height:50px">
					<button type="button" onclick="save()">수정</button>
				</td>
			</tr>
		</table>
	</form>
	
	<script>
		function save() {
			if (confirm('OK?')) {
				document.DirForm.action = '${path }/guestBook/sujungProc';
				document.DirForm.method = 'post';
				document.DirForm.submit();
			}//if
		}//save
	</script>
	
</body>
</html>