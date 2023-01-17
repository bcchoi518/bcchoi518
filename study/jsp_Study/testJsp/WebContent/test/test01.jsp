<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String name = "홍길동";
	int kor = 80;
	int eng = 80;
	int mat = 90;
	int tot = kor + eng + mat;
	double avg = Math.round((tot / 3.0) * 100) / 100.0;
	String grade = "가";
	if (avg >= 90) {
		grade = "수";
	} else if (avg >= 80) {
		grade = "우";
	}  else if (avg >= 70) {
		grade = "미";
	}  else if (avg >= 60) {
		grade = "양";
	}//end if
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<tr>
		<td>이름</td>
		<td><%=name%></td>
	</tr>
	<tr>
		<td>국어</td>
		<td><%=kor%></td>
	</tr>
	<tr>
		<td>영어</td>
		<td><%=eng%></td>
	</tr>
	<tr>
		<td>수학</td>
		<td><%=mat%></td>
	</tr>
	<tr>
		<td>총점</td>
		<td><%=tot%></td>
	</tr>
	<tr>
		<td>평균</td>
		<td>
		<%=avg%>
		<% if (avg >= 80) { %>
			(<font style="color: red; font-weight: bold;"><%=grade%></font>)
		<% } else { %>
			(<%=grade%>)
		<% } %>
		</td>
	<%-- </tr>
	<tr>
		<td>등급</td>
		<td><%=grade%></td>
	</tr> --%>
</table>

</body>
</html>