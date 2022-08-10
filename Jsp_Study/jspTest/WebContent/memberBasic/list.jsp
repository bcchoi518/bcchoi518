<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="memberBasic.MemberBasicDAO"%>
<%@ page import="memberBasic.MemberBasicDTO"%>
<%@ page import="java.util.ArrayList"%>
    
<%
	MemberBasicDAO dao = new MemberBasicDAO();
	ArrayList<MemberBasicDTO> list = new ArrayList<>();
	list = dao.getSelectAll();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="80%" align="center">
		<tr>
			<td height="100px" align="center">
				<jsp:include page="../include/inc_menu.jsp"></jsp:include>
			</td>
		</tr>
		<tr>
			<td height="300px" align="center">
<!-- 본문 내용 시작 -->
				<h2>회원목록</h2>
				<table border="1" width="70%">
					<tr>
						<th>순번</th>
						<th>아이디</th>
						<th>이름</th>
						<th>연락처</th>
						<th>이메일</th>
						<th>등록일</th>
					</tr>
					<%
						int totalCount = list.size(); 
						for (MemberBasicDTO dto : list) {
					%>
						<tr>
							<td><%=totalCount-- %></td>
							<td><a href="#" onClick="move('view', '<%=dto.getId() %>')"><%=dto.getId() %></a></td>
							<td><%=dto.getName() %></td>
							<td><%=dto.getPhone() %></td>
							<td><%=dto.getEmail() %></td>
							<td><%=dto.getRegiDate() %></td>
						</tr>
					<%		
						}//for
					%>
				</table>
				<div style="width:70%; text-align:right; margin-top:10px;">
				|
				<a href="#" onClick="move('list')">목록</a>
				|
				<a href="#" onClick="move('chuga')">등록</a>
				|
				</div>
<!-- 본문 내용 끝 -->
			</td>
		<tr>
			<td height="100px" align="center">
				<jsp:include page="../include/inc_bottom.jsp"></jsp:include>
			</td>
		</tr>
	</table>
	<script>
		function move(value1, value2) {
			if (value2 == undefined) {
				location.href = value1 + '.jsp';
			} else {
				location.href = value1 + '.jsp?arg1=' + value2;
			}//if
		}//move
	</script>
</body>
</html>