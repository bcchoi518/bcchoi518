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
		<table border="1"> 
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="passwd" /></td>
			</tr>
			<tr align="center" height="50px">
				<td colspan="2">
					<button type="button" onclick="save()">로그인</button>
				</td>
			</tr>
		</table>
	</form>

	<script>
		function save() {
			if (confirm('저장할까요?')) {
				document.DirForm.action = '${path }/member/loginProc';
				document.DirForm.method = 'post';
				document.DirForm.submit();
			}//if
		}//save
	</script>
	
</body>
</html>
