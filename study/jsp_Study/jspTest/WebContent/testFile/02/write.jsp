<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Test</h2>
	<form name="frm">
		name: <input type="text" name="name"><br>
		email: <input type="text" name="email"><br>
		subject: <input type="text" name="subject"><br>
		content: <textarea type="text" name="content" style="width:300px; height:100px"></textarea><br>
		<button type="submit" onClick="save()">확인</button>
	</form>
		<button type="submit" onClick="move()">목록</button>
	<script>
		function save() {
			document.frm.action = "writeProc.jsp";
			document.frm.method = "post";
			document.frm.submit();
		}//end save
		function move() {
			location.href="list.jsp";
		}//end move
	</script>
</body>
</html>