<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file = "../../_include/inc_menu.jsp" %>
	
	<h2>01</h2>
	
	<form name="DirForm">
		<table border="1">
			<tr>
				<td>이름 : </td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>주소 : </td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>나이 : </td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="button" onclick="save()">확인</button>
				</td>
			</tr>
		</table>
	</form>
	
	<script>
		function save() {
			if (confirm('실행할까요?')) {
				document.DirForm.action = '${path }/exam_servlet/01Proc.do';
				document.DirForm.method = 'post';
				document.DirForm.submit();
			}//if
		}//save
	</script>
</body>
</html>
