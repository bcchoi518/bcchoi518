<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file = "../../_include/inc_header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file = "../../_include/inc_menu.jsp" %>
	
	<h2>04Result</h2>
<!-- 이름, 출생연도 입력받고 이름, 출생연도, 나이 출력 -->
	<c:forEach var="str" items="${requestScope.list }">
	<c:set var="array" value="${fn:split(str, '|') }" />
	<c:set var="name" value="${array[0] }" />
	<c:set var="address" value="${array[1] }" />
	<c:set var="age" value="${array[2] }" />
		<table border="1">
			<tr>
				<td>이름 : </td>
				<td>${name }</td>
			</tr>
			<tr>
				<td>주소 : </td>
				<td>${address }</td>
			</tr>
			<tr>
				<td>나이 : </td>
				<td>${age }</td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>